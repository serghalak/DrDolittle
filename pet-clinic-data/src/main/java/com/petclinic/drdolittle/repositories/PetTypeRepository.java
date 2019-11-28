package com.petclinic.drdolittle.repositories;

import com.petclinic.drdolittle.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
