package com.service.core.impl;

import org.springframework.stereotype.Service;
import com.domain.core.impl.ConferenciaDomainService;
import com.service.EquipoService;
import com.service.core.DomainConferenciaService;

@Service
public class ConferenciasServiceImpl  extends ConferenciaDomainService implements DomainConferenciaService{

  EquipoService equipoService;
  
  @Override
  public void validamaximoequipos() {
    // TODO Auto-generated method stub
    long size = equipoService.count();
    
    if (size > 3) {
      System.out.println("Cantidad Maxima Excedida!");
    }
  }

}
