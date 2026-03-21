package com.duoc.veterinaria.repository;

import com.duoc.veterinaria.model.factura.FacturaEntity;
import com.duoc.veterinaria.model.paciente.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FacturaRepository extends JpaRepository<FacturaEntity, Long> {
    List<FacturaEntity> findByPaciente(Paciente paciente);
}
