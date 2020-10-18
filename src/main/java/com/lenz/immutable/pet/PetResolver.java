package com.lenz.immutable.pet;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.lenz.immutable.hero.Hero;

import org.springframework.stereotype.Component;

@Component
public class PetResolver implements GraphQLResolver<Pet> {
  public Hero owner(Pet pet) {
    return pet.getOwner();
  }
}
