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
   // long size = equipoService.count();
    
    long equiposActualesTabla = 5; //dato que se obtiene de la cantidad de elementos en la tabla Equipo
    
    if (equiposActualesTabla > 3) {
      System.out.println("Cantidad Maxima Excedida!");
    }
    
    else {
      System.out.println("Cantidad Normal");
    }
  }

  @Override
  public void validamaximoperiodistasporsala() {
    // TODO Auto-generated method stub
    long periodistasActualesSala = 4; // dato obtenido al filtrar cantidad de periodistas en una sala
    
    if (periodistasActualesSala > 3) {
      System.out.println("Cantidad Maxima Excedida!");
      System.out.println("No se permiten mas entradas");
    }
    
    else {
      System.out.println("Cantidad Normal");
    }
  }

  @Override
  public void validamaximoconferenciasporsala() {
    // TODO Auto-generated method stub
    
    long conferenciasPorSala = 9;  //dato obtenido al filtrar cantidad de conferencias por sala
    
    if (conferenciasPorSala > 3) {
      System.out.println("Cantidad Maxima Excedida!");
      System.out.println("No se permiten mas entradas");
    }
    
    else {
      System.out.println("Cantidad Normal");
    }
  }

  @Override
  public void validamaximojugadoresporequipo() {
    // TODO Auto-generated method stub
   long jugadoresporequipotitular= 11; 
   long jugadoresporequiposuplente= 6;
   
   if (jugadoresporequipotitular < 11) {
     System.out.println("Faltan jugadores para completar nomina titular");
   }
   
   else if (jugadoresporequiposuplente < 6){
     System.out.println("Faltan jugadores para completar nomina suplente");
   } 
   
   else if (jugadoresporequipotitular + jugadoresporequiposuplente < 17) {
     System.out.println("Faltan jugadores para completar nomina!");
   }
   
   else {
     System.out.println("Cantidad Normal");
   }
  }

  @Override
  public void validamaximopreguntasporperiodista() {
    // TODO Auto-generated method stub
    long preguntasPorPeriodista = 9;  //dato obtenido de cantidad de preguntas por periodista
    
    if (preguntasPorPeriodista > 3) {
      System.out.println("Cantidad Maxima de Preguntas");
    }
    
    else {
      System.out.println("Cantidad Normal");
    }
    
  }
}
