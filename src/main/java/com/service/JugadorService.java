package com.service;

import java.util.List;
import com.domain.Jugador;

public interface JugadorService {
  
  Jugador save(Jugador jugador);
  
  List<Jugador> findAll();

  Jugador findById(Long id);

  void delete(Jugador directivo);

}
