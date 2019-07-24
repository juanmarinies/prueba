package com.domain.core.impl;

import com.domain.Tecnico;
import com.domain.core.IConferenciaDomainService;
import java.sql.*;

public abstract class ConferenciaDomainService implements IConferenciaDomainService {

  @Override
  public Tecnico validatecnico(String tecnicoName, Tecnico tecnicoDetails) {
    // TODO Auto-generated method stub
    Tecnico tecnico = new Tecnico();
    tecnico.setTecnicoName(tecnicoDetails.getTecnicoName());
    return tecnico;
  }


}
