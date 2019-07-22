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
  @Column(name="preguntas")
  private String preguntas;
    
  
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

  public String getPregunta() {
    return preguntas;
  }

  public Pregunta setPregunta(String pregunta) {
    this.preguntas = pregunta;
    return this;
  }
}
