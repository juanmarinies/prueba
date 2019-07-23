package com.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.domain.Sala;
import com.repository.SalaRepository;
import com.service.SalaService;

@Service
@Transactional
public class SalaServiceImpl implements SalaService {
  
  private final SalaRepository salaRepository;
  
  public SalaServiceImpl(SalaRepository salaRepository) {
    this.salaRepository = salaRepository;
  }

  @Override
  public Sala save(Sala sala) {
    // TODO Auto-generated method stub
    return salaRepository.save(sala);
  }

  @Override
  public List<Sala> findAll() {
    // TODO Auto-generated method stub
    return salaRepository.findAll();
  }

  @Override
  public Sala findById(Long id) {
    // TODO Auto-generated method stub
    return salaRepository.getOne(id);
  }

  @Override
  public void delete(Sala sala) {
    // TODO Auto-generated method stub
    salaRepository.delete(sala);
  }

}
