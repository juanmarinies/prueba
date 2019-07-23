package com.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.domain.Equipo;
import com.repository.EquipoRepository;
import com.service.EquipoService;

@Service
@Transactional
public class EquipoServiceImpl implements EquipoService {
  
  private final EquipoRepository equipoRepository;
  
  public EquipoServiceImpl(EquipoRepository equipoRepository) {
    this.equipoRepository = equipoRepository;
  }

  @Override
  public Equipo save(Equipo equipo) {
    // TODO Auto-generated method stub
    return equipoRepository.save(equipo);
  }

  @Override
  public List<Equipo> findAll() {
    // TODO Auto-generated method stub
    return equipoRepository.findAll();
  }

  @Override
  public Equipo findById(Long id) {
    // TODO Auto-generated method stub
    return equipoRepository.getOne(id);
  }

  @Override
  public void delete(Equipo equipo) {
    // TODO Auto-generated method stub
    equipoRepository.delete(equipo);
  }

}
