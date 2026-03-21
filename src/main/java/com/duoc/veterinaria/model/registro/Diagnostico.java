package com.duoc.veterinaria.model.registro;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Diagnostico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String descripcion;
    
    private LocalDateTime fecha;
    
    private String veterinario;

    @ManyToOne
    @JoinColumn(name = "registro_id")
    private RegistroMedico registroMedico;

    public Diagnostico() {
    }

    public Diagnostico(String descripcion, LocalDateTime fecha, String veterinario) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.veterinario = veterinario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }

    public RegistroMedico getRegistroMedico() {
        return registroMedico;
    }

    public void setRegistroMedico(RegistroMedico registroMedico) {
        this.registroMedico = registroMedico;
    }
}
