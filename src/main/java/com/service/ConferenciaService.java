package com.service;

import java.util.List;
import com.domain.Conferencia;

public interface ConferenciaService {
  Conferencia save(Conferencia conferencia);
  
  List<Conferencia> findAll();

  Conferencia findById(Long conferenciaId);

  void delete(Conferencia conferencia);
}
