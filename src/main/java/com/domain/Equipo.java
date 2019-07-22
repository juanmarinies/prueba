package com.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "equipo")
@EntityListeners(AuditingEntityListener.class)
public class Equipo {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="equipo_id")
  private Long id;
  
  @NotBlank
  @Column(name="equipo_name")
  private Equipo equipoName;
  
  @OneToMany(mappedBy = "equipoName")
  private List<Conferencia> conferencias= new ArrayList<>();
  
  @OneToOne
  @JoinColumn(name = "tecnico_id")
  private List<Tecnico> etecnicoName;
  
  @OneToOne
  @JoinColumn(name = "directivo_id")
  private List <Directivo> directivoName;
  
  
  private List<Jugador> jugadorName;
  
  public Equipo() {
  }

  public Equipo(@NotBlank Equipo equipoName, List<Tecnico> etecnicoName, List<Directivo> directivoName, List<Jugador> jugadorName) {
    this.equipoName = equipoName;
    this.etecnicoName = etecnicoName;
    this.directivoName = directivoName;
    this.jugadorName = jugadorName;
  }

  public Long getId() {
    return id;
  }

  public Equipo setId(Long id) {
    this.id = id;
    return this;
  }

  public Equipo getEquipoName() {
    return equipoName;
  }

  public Equipo setEquipoName(Equipo equipoName) {
    this.equipoName = equipoName;
    return this;
  }

  public List<Tecnico> getEtecnicoName() {
    return etecnicoName;
  }

  public Equipo setEtecnicoName(List<Tecnico> etecnicoName) {
    this.etecnicoName = etecnicoName;
    return this;
  }

  public List<Directivo> getDirectivoName() {
    return directivoName;
  }

  public Equipo setDirectivoName(List<Directivo> directivoName) {
    this.directivoName = directivoName;
    return this;
  }

  public List<Jugador> getJugadorName() {
    return jugadorName;
  }

  public Equipo setJugadorName(List<Jugador> jugadorName) {
    this.jugadorName = jugadorName;
    return this;
  }
  
}
