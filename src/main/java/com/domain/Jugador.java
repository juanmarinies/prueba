package com.domain;

import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "jugador")
@EntityListeners(AuditingEntityListener.class)
public class Jugador {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="jugador_id")
  private Long id;
  
  @NotBlank
  @Column(name="jugador_name")
  private String jugadorName;
  
  @ManyToMany(mappedBy = "jugadores")
  private List<Equipo> equipos;
  
  public Jugador() {
  }

  
  public Jugador(@NotBlank String jugadorName) {
    this.jugadorName = jugadorName;
  }


  public Long getId() {
    return id;
  }


  public Jugador setId(Long id) {
    this.id = id;
    return this;
  }


  public String getJugadorName() {
    return jugadorName;
  }


  public Jugador setJugadorName(String jugadorName) {
    this.jugadorName = jugadorName;
    return this;
  }
  
  
}
