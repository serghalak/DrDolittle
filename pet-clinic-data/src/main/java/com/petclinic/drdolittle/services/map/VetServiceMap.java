package com.petclinic.drdolittle.services.map;

import com.petclinic.drdolittle.model.Vet;
import com.petclinic.drdolittle.services.CrudService;
import com.petclinic.drdolittle.services.VetService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet,Long>
    implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet.getId(),vet);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
