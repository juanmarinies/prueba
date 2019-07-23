package com.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "tecnico")
@EntityListeners(AuditingEntityListener.class)
public class Tecnico {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="tecnico_id")
  private Long id;
  
  @NotBlank
  @Column(name="tecnico_name")
  private String tecnicoName;
  
  private Equipo equipo;
  
  public Tecnico() {
  }

  
  public Tecnico(@NotBlank String tecnicoName) {
    this.tecnicoName = tecnicoName;
  }


  public Long getId() {
    return id;
  }


  public Tecnico setId(Long id) {
    this.id = id;
    return this;
  }


  public String getTecnicoName() {
    return tecnicoName;
  }


  public Tecnico setTecnicoName(String tecnicoName) {
    this.tecnicoName = tecnicoName;
    return this;
  }


  public Equipo getEquipo() {
    return equipo;
  }


  public Tecnico setEquipo(Equipo equipo) {
    this.equipo = equipo;
    return this;
  }
}
