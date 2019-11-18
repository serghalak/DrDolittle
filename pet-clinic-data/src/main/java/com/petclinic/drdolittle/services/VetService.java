package com.petclinic.drdolittle.services;

import com.petclinic.drdolittle.model.Owner;
import com.petclinic.drdolittle.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();

}
