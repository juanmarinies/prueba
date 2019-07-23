package com.service.impl;

import java.util.List;
import com.domain.Canal;
import com.repository.CanalRepository;
import com.service.CanalService;

public class CanalServiceImpl implements CanalService {
  
  private final CanalRepository canalRepository;
  
  public CanalServiceImpl(CanalRepository canalRepository) {
    this.canalRepository = canalRepository;
  }

  @Override
  public Canal save(Canal canal) {
    // TODO Auto-generated method stub
    return canalRepository.save(canal);
  }

  @Override
  public List<Canal> findAll() {
    // TODO Auto-generated method stub
    return canalRepository.findAll();
  }

  @Override
  public Canal findById(Long id) {
    // TODO Auto-generated method stub
    return canalRepository.getOne(id);
  }

  @Override
  public void delete(Canal canal) {
    // TODO Auto-generated method stub
    canalRepository.delete(canal); 
  }

}
