package com.service;

import java.util.List;
import com.domain.Tecnico;

public interface TecnicoService {
  
  Tecnico save(Tecnico tecnico);
  
  List<Tecnico> findAll();

  Tecnico findById(Long id);

  void delete(Tecnico tecnico);
  
}
