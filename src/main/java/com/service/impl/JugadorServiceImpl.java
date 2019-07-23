package com.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.domain.Jugador;
import com.repository.JugadorRepository;
import com.service.JugadorService;

@Service
@Transactional
public class JugadorServiceImpl implements JugadorService {
  
  private final JugadorRepository jugadorRepository;
  
  public JugadorServiceImpl(JugadorRepository jugadorRepository) {
    this.jugadorRepository = jugadorRepository;
  }

  @Override
  public Jugador save(Jugador jugador) {
    // TODO Auto-generated method stub
    return jugadorRepository.save(jugador);
  }

  @Override
  public List<Jugador> findAll() {
    // TODO Auto-generated method stub
    return jugadorRepository.findAll();
  }

  @Override
  public Jugador findById(Long id) {
    // TODO Auto-generated method stub
    return jugadorRepository.getOne(id);
  }

  @Override
  public void delete(Jugador jugador) {
    // TODO Auto-generated method stub
    jugadorRepository.delete(jugador);
  }

}
