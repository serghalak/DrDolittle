package com.petclinic.drdolittle.services.springdatajpa;

import com.petclinic.drdolittle.model.Owner;
import com.petclinic.drdolittle.repositories.OwnerRepository;
import com.petclinic.drdolittle.repositories.PetRepository;
import com.petclinic.drdolittle.repositories.PetTypeRepository;
import com.petclinic.drdolittle.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService {

    private OwnerRepository ownerRepository;
    private PetRepository petRepository;
    private PetTypeRepository petTypeRepository;


    public OwnerSDJpaService(OwnerRepository ownerRepository,
                             PetRepository petRepository,
                             PetTypeRepository petTypeRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }



    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners=new HashSet<>();
        ownerRepository.findAll().forEach( owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long id) {
        //Optional<Owner> optionalOwner = ownerRepository.findById(id);
//        if(optionalOwner.isPresent()){
//            return optionalOwner.get();
//        }else{
//            return null;
//        }
        //return optionalOwner.orElse(null);
        //return ownerRepository.findById(id).get();

        return ownerRepository.findById(id).orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object );
    }

    @Override
    public void deleteById(Long id) {
        ownerRepository.findById(id);
    }
}
