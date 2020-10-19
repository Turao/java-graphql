package com.lenz.immutable.graphql.hero;

import java.util.UUID;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.lenz.immutable.graphql.hero.createhero.CreateHeroInput;
import com.lenz.immutable.graphql.hero.createhero.CreateHeroPayload;
import com.lenz.immutable.graphql.hero.killhero.KillHeroInput;
import com.lenz.immutable.graphql.hero.killhero.KillHeroPayload;
import com.lenz.immutable.graphql.hero.updatehero.UpdateHeroInput;
import com.lenz.immutable.graphql.hero.updatehero.UpdateHeroPayload;
import com.lenz.immutable.domain.hero.Hero;
import com.lenz.immutable.domain.hero.HeroRepository;

import org.springframework.stereotype.Component;

@Component
public class HeroMutationResolver implements GraphQLMutationResolver {
  private final HeroRepository repository;

  public HeroMutationResolver(HeroRepository repository) {
    this.repository = repository;
  }

  public CreateHeroPayload createHero(CreateHeroInput input) {
    var hero = new Hero(UUID.randomUUID(), input.name(), 100L);
    hero = repository.save(hero);
    return new CreateHeroPayload(hero);
  }

  public UpdateHeroPayload updateHero(UpdateHeroInput input) {
    var hero = repository.findById(input.id()).orElseThrow();
    hero = repository.save(
      hero.name(input.name())
    );
    return new UpdateHeroPayload(hero);
  }

  public KillHeroPayload killHero(KillHeroInput input) {
    var hero = repository.findById(input.id()).orElseThrow();
    hero = repository.save(
      hero.health(0L)
    );
    return new KillHeroPayload(hero);
  }
}
