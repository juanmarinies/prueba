package com.service;

import java.util.List;
import com.domain.Sala;

public interface SalaService {
  
  Sala save(Sala sala);
  
  List<Sala> findAll();

  Sala findById(Long id);

  void delete(Sala sala);
  
}
