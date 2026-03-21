package com.duoc.veterinaria.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.duoc.veterinaria.model.paciente.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
