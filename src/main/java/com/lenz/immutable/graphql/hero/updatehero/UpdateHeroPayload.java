package com.lenz.immutable.graphql.hero.updatehero;

import com.lenz.immutable.domain.hero.Hero;

public class UpdateHeroPayload {
  private final Hero hero;
  
  public UpdateHeroPayload(Hero hero) {
    this.hero = hero;
  }

  public Hero getHero() {
    return hero;
  }
}
