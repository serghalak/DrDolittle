package com.petclinic.drdolittle.services;

import com.petclinic.drdolittle.model.Owner;
import com.petclinic.drdolittle.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
