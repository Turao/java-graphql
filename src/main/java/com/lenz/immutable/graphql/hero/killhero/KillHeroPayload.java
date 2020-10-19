package com.lenz.immutable.graphql.hero.killhero;

import com.lenz.immutable.domain.hero.Hero;

public class KillHeroPayload {
  private final Hero hero;

  public KillHeroPayload(Hero hero) {
    this.hero = hero;
  }

  public Hero hero() {
    return hero;
  }
}
