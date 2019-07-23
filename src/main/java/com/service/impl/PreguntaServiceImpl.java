package com.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.domain.Pregunta;
import com.repository.PreguntaRepository;
import com.service.PreguntaService;

@Service
@Transactional
public class PreguntaServiceImpl implements PreguntaService {
  
  private final PreguntaRepository preguntaRepository;
  
  public PreguntaServiceImpl(PreguntaRepository preguntaRepository) {
    this.preguntaRepository = preguntaRepository;
  }

  @Override
  public Pregunta save(Pregunta pregunta) {
    // TODO Auto-generated method stub
    return preguntaRepository.save(pregunta);
  }

  @Override
  public List<Pregunta> findAll() {
    // TODO Auto-generated method stub
    return preguntaRepository.findAll();
  }

  @Override
  public Pregunta findById(Long id) {
    // TODO Auto-generated method stub
    return preguntaRepository.getOne(id);
  }

  @Override
  public void delete(Pregunta pregunta) {
    // TODO Auto-generated method stub
    preguntaRepository.delete(pregunta);
  }

}
