package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.domain.Pregunta;

public interface PreguntaRepository extends JpaRepository<Pregunta, Long>{

}
