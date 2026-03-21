package com.duoc.veterinaria.model.factura;

import com.duoc.veterinaria.model.paciente.Paciente;
import jakarta.persistence.*;

@Entity
@Table(name = "facturas")
public class FacturaEntity implements Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    @Transient
    private Factura factura;

    private double total;

    @Column(length = 1000)
    private String descripcion;

    @Column(name = "veterinario_responsable")
    private String veterinarioResponsable;

    @Column(length = 500)
    private String notas;

    public FacturaEntity() {
    }

    public FacturaEntity(Paciente paciente, Factura factura) {
        this.paciente = paciente;
        this.factura = factura;
        this.total = factura.getCosto();
        this.descripcion = factura.getDescripcion();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Factura getFactura() {
        if (factura == null && total > 0) {
            // Reconstruir desde los valores persistidos en BD
            final double costoGuardado = this.total;
            final String descGuardada = this.descripcion;
            factura = new Factura() {
                public String getDescripcion() { return descGuardada; }
                public double getCosto() { return costoGuardado; }
            };
        }
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
        if (factura != null) {
            this.total = factura.getCosto();
            this.descripcion = factura.getDescripcion();
        } else {
            this.total = 0.0;
            this.descripcion = "";
        }
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public double getCosto() {
        return total;
    }

    public double getTotal() {
        return total;
    }

    public String getDescripcionDetalle() {
        return descripcion;
    }

    public String getVeterinarioResponsable() {
        return veterinarioResponsable;
    }

    public void setVeterinarioResponsable(String veterinarioResponsable) {
        this.veterinarioResponsable = veterinarioResponsable;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public void actualizarTotal() {
        this.total = factura.getCosto();
        this.descripcion = factura.getDescripcion();
    }
}
