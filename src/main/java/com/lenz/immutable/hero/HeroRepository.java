package com.lenz.immutable.hero;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

public interface HeroRepository extends CrudRepository<Hero, UUID> {
}
