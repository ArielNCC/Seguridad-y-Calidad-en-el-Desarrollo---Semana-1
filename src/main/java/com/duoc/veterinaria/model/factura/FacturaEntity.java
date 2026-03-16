package com.duoc.veterinaria.model.factura;

import com.duoc.veterinaria.model.paciente.Paciente;

public class FacturaEntity implements Factura {

    private Long id;
    
    private Paciente paciente;
    
    private Factura factura;
    
    private double total;
    
    private String descripcion;

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
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
        this.total = factura.getCosto();
        this.descripcion = factura.getDescripcion();
    }

    @Override
    public String getDescripcion() {
        return factura.getDescripcion();
    }

    @Override
    public double getCosto() {
        return factura.getCosto();
    }

    public void actualizarTotal() {
        this.total = factura.getCosto();
        this.descripcion = factura.getDescripcion();
    }
}
