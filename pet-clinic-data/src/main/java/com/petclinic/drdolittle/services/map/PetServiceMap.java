package com.petclinic.drdolittle.services.map;

import com.petclinic.drdolittle.model.Pet;
import com.petclinic.drdolittle.services.CrudService;
import com.petclinic.drdolittle.services.PetService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet,Long>
        implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(),pet);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
