package com.domain;

import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "periodista")
@EntityListeners(AuditingEntityListener.class)
public class Periodista {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="periodista_id")
  private Long id;
  
  @NotBlank
  @Column(name="periodista_name")
  private Periodista periodistaName;
  
  @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
  @JoinColumn(name= "conferencia_id")
  private Conferencia conferencia;
  
  @OneToMany(mappedBy = "periodista")
  private List<Canal> canalName;
  
  private List<Pregunta> pregunta;
  
  public Periodista() {
  }

  

  public Periodista(@NotBlank Periodista periodistaName) {
    this.periodistaName = periodistaName;
  }



  public Long getId() {
    return id;
  }

  public Periodista setId(Long id) {
    this.id = id;
    return this;
  }

  public Periodista getPeriodistaName() {
    return periodistaName;
  }

  public Periodista setPeriodistaName(Periodista periodistaName) {
    this.periodistaName = periodistaName;
    return this;
  }

  public List<Canal> getCanalName() {
    return canalName;
  }

  public Periodista setCanalName(List<Canal> canalName) {
    this.canalName = canalName;
    return this;
  }

  public List<Pregunta> getPregunta() {
    return pregunta;
  }

  public Periodista setPregunta(List<Pregunta> pregunta) {
    this.pregunta = pregunta;
    return this;
  }


  public Conferencia getConferencia() {
    return conferencia;
  }

  public Periodista setConferencia(Conferencia conferencia) {
    this.conferencia = conferencia;
    return this;
  }
  
}
