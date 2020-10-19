package com.lenz.immutable.graphql.hero.updatehero;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateHeroInput {
  private final UUID id;
  private final String name;

  @JsonCreator
  public UpdateHeroInput(
    @JsonProperty("id") UUID id,
    @JsonProperty("name") String name
  ) {
    this.id = id;
    this.name = name;
  }

  public UUID id() {
    return id;
  }

  public String name() {
    return name;
  }
}
