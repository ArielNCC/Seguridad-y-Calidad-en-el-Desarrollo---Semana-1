package com.duoc.veterinaria.model.registro;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Tratamiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    
    private String descripcion;
    
    private LocalDate fechaInicio;
    
    private LocalDate fechaFin;
    
    private String instrucciones;

    @ManyToOne
    @JoinColumn(name = "registro_id")
    private RegistroMedico registroMedico;

    public Tratamiento() {
    }

    public Tratamiento(String nombre, String descripcion, LocalDate fechaInicio, LocalDate fechaFin, String instrucciones) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.instrucciones = instrucciones;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public RegistroMedico getRegistroMedico() {
        return registroMedico;
    }

    public void setRegistroMedico(RegistroMedico registroMedico) {
        this.registroMedico = registroMedico;
    }
}
