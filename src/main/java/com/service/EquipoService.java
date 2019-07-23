package com.service;

import java.util.List;
import com.domain.Equipo;

public interface EquipoService {
  
  Equipo save(Equipo equipo);
  
  List<Equipo> findAll();

  Equipo findById(Long id);

  void delete(Equipo equipo);

}
