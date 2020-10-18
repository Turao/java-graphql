package com.lenz.immutable.pet;

import java.util.UUID;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import org.springframework.stereotype.Component;

@Component
public class PetQueryResolver implements GraphQLQueryResolver {
  private final PetRepository repository;

  public PetQueryResolver(PetRepository repository) {
    this.repository = repository;
  }

  public Iterable<Pet> pets() {
    return repository.findAll();
  }

  public Pet pet(UUID id) {
    return repository.findById(id).orElseThrow();
  }

}
