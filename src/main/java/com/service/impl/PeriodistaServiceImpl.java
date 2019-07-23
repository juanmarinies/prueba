package com.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.domain.Periodista;
import com.repository.PeriodistaRepository;
import com.service.PeriodistaService;

@Service
@Transactional
public class PeriodistaServiceImpl implements PeriodistaService {
  
  private final PeriodistaRepository periodistaRepository;
  
  public PeriodistaServiceImpl(PeriodistaRepository periodistaRepository) {
    this.periodistaRepository = periodistaRepository;
  }

  @Override
  public Periodista save(Periodista periodista) {
    // TODO Auto-generated method stub
    return periodistaRepository.save(periodista);
  }

  @Override
  public List<Periodista> findAll() {
    // TODO Auto-generated method stub
    return periodistaRepository.findAll();
  }

  @Override
  public Periodista findById(Long id) {
    // TODO Auto-generated method stub
    return periodistaRepository.getOne(id);
  }

  @Override
  public void delete(Periodista periodista) {
    // TODO Auto-generated method stub
    periodistaRepository.delete(periodista);
  }

}
