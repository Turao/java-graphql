package com.lenz.immutable.hero;

import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.lenz.immutable.pet.PetRepository;

import org.springframework.stereotype.Component;

@Component
public class HeroMutationResolver implements GraphQLMutationResolver {
  private final HeroRepository repository;
  private final PetRepository petRepository;


  public HeroMutationResolver(HeroRepository repository, PetRepository petRepository) {
    this.repository = repository;
    this.petRepository = petRepository;
  }

  public Hero createHero(String name, Collection<UUID> petIds) {
    var pets = petRepository.findAllById(petIds);
    var hero = new Hero(UUID.randomUUID(), name, new ArrayList<>());
    return repository.save(hero);
  }
}
