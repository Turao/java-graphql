package com.lenz.immutable.domain.hero;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

public interface HeroRepository extends CrudRepository<Hero, UUID> {
}
