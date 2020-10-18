package com.lenz.immutable.hero;

import java.util.Collection;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.lenz.immutable.pet.Pet;

import org.springframework.stereotype.Component;

@Component
public class HeroResolver implements GraphQLResolver<Hero> {
  public Collection<Pet> pets(Hero hero) {
    return hero.getPets();
  }
}
