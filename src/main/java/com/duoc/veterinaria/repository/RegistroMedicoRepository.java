package com.duoc.veterinaria.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.duoc.veterinaria.model.paciente.Paciente;
import com.duoc.veterinaria.model.registro.RegistroMedico;

@Repository
public interface RegistroMedicoRepository extends JpaRepository<RegistroMedico, Long> {

    List<RegistroMedico> findByPaciente(Paciente paciente);

    List<RegistroMedico> findByVeterinarioResponsable(String veterinarioResponsable);
}
