package com.lenz.immutable.hero;

import java.util.UUID;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import org.springframework.stereotype.Component;

@Component
public class HeroQueryResolver implements GraphQLQueryResolver {
  private final HeroRepository repository;

  public HeroQueryResolver(HeroRepository repository) {
    this.repository = repository;
  }

  public Iterable<Hero> heroes() {
    return repository.findAll();
  }
  
  public Hero hero(UUID id) {
    return repository.findById(id).orElseThrow();
  }
  
}
