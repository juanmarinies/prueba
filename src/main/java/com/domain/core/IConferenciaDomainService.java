package com.domain.core;

import com.domain.Tecnico;

public interface IConferenciaDomainService {
  void validamaximoequipos ();
  
  void validamaximoperiodistasporsala();
  
  void validamaximoconferenciasporsala();
  
  void validamaximojugadoresporequipo();
  
  void validamaximopreguntasporperiodista();
  
  Tecnico validatecnico(String tecnicoName, Tecnico tecnicoDetails);
}
