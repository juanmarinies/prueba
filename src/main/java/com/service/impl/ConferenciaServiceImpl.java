package com.service.impl;

import java.util.List;
import com.domain.Conferencia;
import com.repository.ConferenciaRepository;
import com.service.ConferenciaService;

public class ConferenciaServiceImpl implements ConferenciaService {

  private final ConferenciaRepository conferenciaRepository;
  
  public ConferenciaServiceImpl(ConferenciaRepository conferenciaRepository) {
    this.conferenciaRepository = conferenciaRepository;
  }

  @Override
  public Conferencia save(Conferencia conferencia) {
    // TODO Auto-generated method stub
    return conferenciaRepository.save(conferencia);
  }

  @Override
  public List<Conferencia> findAll() {
    // TODO Auto-generated method stub
    return conferenciaRepository.findAll();
  }

  @Override
  public Conferencia findById(Long id) {
    // TODO Auto-generated method stub
    return conferenciaRepository.getOne(id);
  }

  @Override
  public void delete(Conferencia conferencia) {
    // TODO Auto-generated method stub
    
  }

}
