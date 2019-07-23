package com.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.domain.Tecnico;
import com.repository.TecnicoRepository;
import com.service.TecnicoService;

@Service
@Transactional
public class TecnicoServiceImpl implements TecnicoService {
  
  private final TecnicoRepository tecnicoRepository;
  
  public TecnicoServiceImpl(TecnicoRepository tecnicoRepository) {
    this.tecnicoRepository = tecnicoRepository;
  }

  @Override
  public Tecnico save(Tecnico tecnico) {
    // TODO Auto-generated method stub
    return tecnicoRepository.save(tecnico);
  }

  @Override
  public List<Tecnico> findAll() {
    // TODO Auto-generated method stub
    return tecnicoRepository.findAll();
  }

  @Override
  public Tecnico findById(Long id) {
    // TODO Auto-generated method stub
    return tecnicoRepository.getOne(id);
  }

  @Override
  public void delete(Tecnico tecnico) {
    // TODO Auto-generated method stub
    tecnicoRepository.delete(tecnico);
  }

}
