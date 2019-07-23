package com.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "directivo")
@EntityListeners(AuditingEntityListener.class)
public class Directivo {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="directivo_id")
  private Long id;
  
  @NotBlank
  @Column(name="directivo_name")
  private String directivoName;
  
  private Equipo equipo;
  
  public Directivo() {
  }

  public Directivo(@NotBlank String directivoName) {
    this.directivoName = directivoName;
  }

  public Long getId() {
    return id;
  }

  public Directivo setId(Long id) {
    this.id = id;
    return this;
  }

  public String getDirectivoName() {
    return directivoName;
  }

  public Directivo setDirectivoName(String directivoName) {
    this.directivoName = directivoName;
    return this;
  }

  public Equipo getEquipo() {
    return equipo;
  }

  public Directivo setEquipo(Equipo equipo) {
    this.equipo = equipo;
    return this;
  }
  
  
  
}
