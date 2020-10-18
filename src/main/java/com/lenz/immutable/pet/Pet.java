package com.lenz.immutable.pet;

import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.lenz.immutable.hero.Hero;

@Entity
@Table(name = "pet")
public class Pet {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  private String name;

  @ManyToOne(cascade = CascadeType.ALL)
  private Hero owner;

  public Pet() {}

  public Pet(UUID id, String name, Hero owner) {
    this.id = id;
    this.name = name;
    this.owner = owner;
  }

  public UUID getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public Hero getOwner() {
    return this.owner;
  }
}
