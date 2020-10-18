package com.lenz.immutable.pet;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, UUID> {
}
