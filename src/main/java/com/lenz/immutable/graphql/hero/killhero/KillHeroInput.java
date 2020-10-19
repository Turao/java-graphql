package com.lenz.immutable.graphql.hero.killhero;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class KillHeroInput {
  private final UUID id;

  @JsonCreator
  public KillHeroInput(
    @JsonProperty("id") UUID id
  ) {
    this.id = id;
  }

  public UUID id() {
    return id;
  }
}
