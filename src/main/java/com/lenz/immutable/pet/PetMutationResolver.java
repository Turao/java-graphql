package com.lenz.immutable.pet;

import java.util.UUID;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.lenz.immutable.hero.HeroRepository;

import org.springframework.stereotype.Component;

@Component
public class PetMutationResolver implements GraphQLMutationResolver {
  private final PetRepository repository;
  private final HeroRepository heroRepository;

  public PetMutationResolver(PetRepository repository, HeroRepository heroRepository) {
    this.repository = repository;
    this.heroRepository = heroRepository;
  }

  public Pet createPet(String name, UUID ownerId) {
    var owner = heroRepository.findById(ownerId).orElseThrow();
    var pet = new Pet(UUID.randomUUID(), name, owner);
    return repository.save(pet);
  }
}
