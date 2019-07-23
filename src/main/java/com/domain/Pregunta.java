package com.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "pregunta")
@EntityListeners(AuditingEntityListener.class)
public class Pregunta {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="pregunta_id")
  private Long id;
  
  @NotBlank
  @Column(name="pregunta")
  private String preguntas;
  
  @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
  @JoinColumn(name= "periodista_id")
  private Periodista periodista;
    
  
  public Pregunta() {
  }

  public Pregunta(@NotBlank String pregunta) {
    this.preguntas = pregunta;
  }

  public Long getId() {
    return id;
  }

  public Pregunta setId(Long id) {
    this.id = id;
    return this;
  }

  public String getPreguntas() {
    return preguntas;
  }

  public Pregunta setPreguntas(String pregunta) {
    this.preguntas = pregunta;
    return this;
  }

  public Periodista getPeriodista() {
    return periodista;
  }

  public Pregunta setPeriodista(Periodista periodista) {
    this.periodista = periodista;
    return this;
  }
  
}
