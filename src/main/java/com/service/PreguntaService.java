package com.service;

import java.util.List;
import com.domain.Pregunta;

public interface PreguntaService {
  
  Pregunta save(Pregunta pregunta);
  
  List<Pregunta> findAll();

  Pregunta findById(Long id);

  void delete(Pregunta pregunta);

}
