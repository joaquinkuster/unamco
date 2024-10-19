package com.app.unamco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.unamco.model.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {

}
