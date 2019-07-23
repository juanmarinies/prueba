package com.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.domain.Directivo;
import com.repository.DirectivoRepository;
import com.service.DirectivoService;

@Service
@Transactional
public class DirectivoServiceImpl implements DirectivoService {
  
  private final DirectivoRepository directivoRepository;
  
  public DirectivoServiceImpl(DirectivoRepository directivoRepository) {
    this.directivoRepository = directivoRepository;
  }

  @Override
  public Directivo save(Directivo directivo) {
    // TODO Auto-generated method stub
    return directivoRepository.save(directivo);
  }

  @Override
  public List<Directivo> findAll() {
    // TODO Auto-generated method stub
    return directivoRepository.findAll();
  }

  @Override
  public Directivo findById(Long id) {
    // TODO Auto-generated method stub
    return directivoRepository.getOne(id);
  }

  @Override
  public void delete(Directivo directivo) {
    // TODO Auto-generated method stub
    directivoRepository.delete(directivo);
  }

}
