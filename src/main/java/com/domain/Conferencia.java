package com.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "conferencia")
@EntityListeners(AuditingEntityListener.class)
public class Conferencia {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="conferencia_id")
  private Long id;
  
  @NotBlank
  @Column(name="conferencia_name")
  private String conferenciaName;
  
  @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
  @JoinColumn(name= "sala_id")
  private Sala salaName;
  
  @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
  @JoinColumn(name= "equipo_id")
  private Equipo equipoName;
  
  @OneToMany(mappedBy = "conferencia")
  private List<Periodista> periodistas= new ArrayList<>();
  
  
 // private List<Periodista> periodistaName= new ArrayList<>();
  
  public Conferencia() {
  }


  public Conferencia(@NotBlank String conferenciaName, Sala salaName, Equipo equipoName, List<Periodista> periodistas) {
    this.conferenciaName = conferenciaName;
  }



  public Long getId() {
    return id;
  }

  public Conferencia setId(Long id) {
    this.id = id;
    return this;
  }

  public String getConferenciaName() {
    return conferenciaName;
  }

  public Conferencia setConferenciaName(String conferenciaName) {
    this.conferenciaName = conferenciaName;
    return this;
  }

  public Sala getSalaName() {
    return salaName;
  }

  public Conferencia setSalaName(Sala salaName) {
    this.salaName = salaName;
    return this;
  }

  public Equipo getEquipoName() {
    return equipoName;
  }

  public Conferencia setEquipoName(Equipo equipoName) {
    this.equipoName = equipoName;
    return this;
  }

  public List<Periodista> getPeriodistas() {
    return periodistas;
  }

  public Conferencia setPeriodistas(List<Periodista> periodistas) {
    this.periodistas = periodistas;
    return this;
  }  
}
