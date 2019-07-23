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
  private String equipoName;
  
  @OneToMany(mappedBy = "equipoName")
  private List<Conferencia> conferencias= new ArrayList<>();
  
  @OneToOne(cascade=CascadeType.ALL)
  @JoinColumn(name ="tecnico_id")
  private Tecnico tecnico;
  
  @OneToOne(cascade=CascadeType.ALL)
  @JoinColumn(name = "directivo_id")
  private Directivo directivo;
  
  @ManyToMany(cascade = { CascadeType.ALL })
  @JoinTable(
      name = "Jugador_Equipo", 
      joinColumns = { @JoinColumn(name = "jugador_id") }, 
      inverseJoinColumns = { @JoinColumn(name = "equipo_id") }
  )
  private List<Jugador> jugadores;
  
  public Equipo() {
  }

  public Equipo(@NotBlank String equipoName) {
    this.equipoName = equipoName;
  }

  public Long getId() {
    return id;
  }

  public Equipo setId(Long id) {
    this.id = id;
    return this;
  }

  public String getEquipoName() {
    return equipoName;
  }

  public Equipo setEquipoName(String equipoName) {
    this.equipoName = equipoName;
    return this;
  }

  public Tecnico getTecnico() {
    return tecnico;
  }

  public Equipo setTecnico(Tecnico tecnico) {
    this.tecnico = tecnico;
    return this;
  }

  public Directivo getDirectivo() {
    return directivo;
  }

  public Equipo setDirectivo(Directivo directivo) {
    this.directivo = directivo;
    return this;
  }

  public List<Jugador> getJugadores() {
    return jugadores;
  }

  public Equipo setJugadores(List<Jugador> jugadores) {
    this.jugadores = jugadores;
    return this;
  }

  public List<Conferencia> getConferencias() {
    return conferencias;
  }

  public Equipo setConferencias(List<Conferencia> conferencias) {
    this.conferencias = conferencias;
    return this;
  }
 
}
