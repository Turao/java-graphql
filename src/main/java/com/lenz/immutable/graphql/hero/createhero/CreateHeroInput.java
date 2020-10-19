package com.lenz.immutable.graphql.hero.createhero;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateHeroInput {
  private final String name;

  @JsonCreator()
  public CreateHeroInput(
    @JsonProperty("name") String name
  ) {
    this.name = name;
  }

  public String name() {
    return name;
  }

}
