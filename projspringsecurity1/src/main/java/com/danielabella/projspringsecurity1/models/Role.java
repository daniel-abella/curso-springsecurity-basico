package com.danielabella.projspringsecurity1.models;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "roles")
@Entity @NoArgsConstructor @Data
public class Role {
	
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Enumerated(EnumType.STRING)
  @Column(length = 20)
  private ERole name;
}