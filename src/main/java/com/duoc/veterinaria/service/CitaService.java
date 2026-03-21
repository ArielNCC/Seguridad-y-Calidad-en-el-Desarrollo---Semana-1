package com.duoc.veterinaria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duoc.veterinaria.model.cita.Cita;
import com.duoc.veterinaria.repository.CitaRepository;

@Service
public class CitaService {
    @Autowired
    private CitaRepository citaRepository;

    public List<Cita> obtenerCitas() {
        return citaRepository.findAll();
    }

    public void guardarCita(Cita cita) {
        citaRepository.save(cita);
    }

    public Cita buscarPorId(Long id) {
        return citaRepository.findById(id).orElse(null);
    }

    public void eliminarCita(Long id) {
        citaRepository.deleteById(id);
    }
}
