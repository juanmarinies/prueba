package com.domain.core.impl;

import java.util.ArrayList;
import java.util.List;
import com.domain.Conferencia;
import com.domain.Equipo;
import com.domain.core.IConferenciaDomainService;

public abstract class ConferenciaDomainService implements IConferenciaDomainService {

  @Override
  public void validamaximoconferencias() {
    // TODO Auto-generated method stub
    ArrayList<Equipo> equipos = new ArrayList<>(); 
    
    @SuppressWarnings("null")
    int size = equipos.size();
    
    if (size > 3 ) {
      System.out.println("Maximo de Equipos Alcanzado");
    }
  }

}
