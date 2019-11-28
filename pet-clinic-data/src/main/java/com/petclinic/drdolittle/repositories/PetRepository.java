package com.petclinic.drdolittle.repositories;

import com.petclinic.drdolittle.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
