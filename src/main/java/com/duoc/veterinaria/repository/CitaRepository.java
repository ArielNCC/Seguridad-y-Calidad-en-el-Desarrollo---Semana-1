package com.duoc.veterinaria.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.duoc.veterinaria.model.cita.Cita;

@Repository
public interface CitaRepository extends JpaRepository<Cita, Long> {

}
