package com.service;

import java.util.List;
import com.domain.Periodista;

public interface PeriodistaService {
  
  Periodista save(Periodista periodista);
  
  List<Periodista> findAll();

  Periodista findById(Long id);

  void delete(Periodista periodista);

}
