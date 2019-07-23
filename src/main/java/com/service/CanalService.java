package com.service;

import java.util.List;
import com.domain.Canal;

public interface CanalService {
  
  Canal save(Canal canal);
  
  List<Canal> findAll();

  Canal findById(Long id);

  void delete(Canal canal);

}
