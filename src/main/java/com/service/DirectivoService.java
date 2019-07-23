package com.service;

import java.util.List;
import com.domain.Directivo;

public interface DirectivoService {
  
  Directivo save(Directivo canal);
  
  List<Directivo> findAll();

  Directivo findById(Long id);

  void delete(Directivo directivo);
  
}
