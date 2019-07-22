package com.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "sala")
@EntityListeners(AuditingEntityListener.class)
public class Sala {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="sala_id")
  private Long id;
  
  @NotBlank
  @Column(name="sala_name")
  private String salaName;
  
  @OneToMany(mappedBy = "salaName")
  private List<Conferencia> conferencias= new ArrayList<>();
  
  public Sala() {
  }

  public Sala(@NotBlank String salaName) {
    this.salaName = salaName;
  }

  public Long getId() {
    return id;
  }

  public Sala setId(Long id) {
    this.id = id;
    return this;
  }

  public String getSalaName() {
    return salaName;
  }

  public Sala setSalaName(String salaName) {
    this.salaName = salaName;
    return this;
  }
}
