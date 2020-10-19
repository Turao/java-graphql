package com.lenz.immutable.domain.hero;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hero")
public class Hero {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  private String name;

  private Long health;

  public Hero() {}

  public Hero(UUID id, String name, Long health) {
    this.id = id;
    this.name = name;
    this.health = health;
  }

  public UUID id() {
    return this.id;
  }

  public String name() {
    return this.name;
  }

  public Hero name(String name) {
    this.name = name;
    return this;
  }

  public Long health() {
    return health;
  }

  public Hero health(Long health) {
    this.health = health;
    return this;
  }

}
