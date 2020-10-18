package com.lenz.immutable.hero;

import java.util.Collection;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.lenz.immutable.pet.Pet;

@Entity
@Table(name = "hero")
public class Hero {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  private String name;

  @OneToMany(mappedBy = "owner", fetch = FetchType.EAGER)
  private Collection<Pet> pets;

  public Hero() {}

  public Hero(UUID id, String name, Collection<Pet> pets) {
    this.id = id;
    this.name = name;
    this.pets = pets;
  }

  public UUID getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public Collection<Pet> getPets() {
    return this.pets;
  }
}
