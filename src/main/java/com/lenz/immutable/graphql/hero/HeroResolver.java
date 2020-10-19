package com.lenz.immutable.graphql.hero;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.lenz.immutable.domain.hero.Hero;

import org.springframework.stereotype.Component;

@Component
public class HeroResolver implements GraphQLResolver<Hero> {}
