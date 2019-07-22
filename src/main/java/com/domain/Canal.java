package com.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "canal")
@EntityListeners(AuditingEntityListener.class)
public class Canal {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="canal_id")
  private Long id;
  
  @NotBlank
  @Column(name="canal_name")
  private String canalName;
  
  @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
  @JoinColumn(name= "periodista_id")
  private Periodista periodista;
  
  public Canal() {
    
  }

  public Canal(@NotBlank String canalName) {
    this.canalName = canalName;
  }

  public Long getId() {
    return id;
  }

  public Canal setId(Long id) {
    this.id = id;
    return this;
  }

  public String getCanalName() {
    return canalName;
  }

  public Canal setCanalName(String canalName) {
    this.canalName = canalName;
    return this;
  }
  
}
