package com.lenz.immutable.graphql.hero.createhero;

import com.lenz.immutable.domain.hero.Hero;

public class CreateHeroPayload {
  private final Hero hero;

  public CreateHeroPayload(Hero hero) {
    this.hero = hero;
  }

  public Hero hero() {
    return hero;
  }
}
