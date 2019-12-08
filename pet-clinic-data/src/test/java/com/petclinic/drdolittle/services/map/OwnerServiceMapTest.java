package com.petclinic.drdolittle.services.map;

import com.petclinic.drdolittle.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerServiceMapTest {

    OwnerServiceMap ownerServiceMap;

    final Long ownerId=1L;

    final String lastName="Smith";

    @BeforeEach
    void setUp() {
        ownerServiceMap=new OwnerServiceMap(new PetTypeMapService(),new PetServiceMap());

        ownerServiceMap.save(Owner.builder().id(1L).lastName(lastName).build());
    }

    @Test
    void findAll() {
        Set<Owner> ownerSet= ownerServiceMap.findAll();

        assertEquals(ownerId,ownerSet.size());
    }

    @Test
    void deleteById() {
        ownerServiceMap.deleteById(ownerId);

        assertEquals(0,ownerServiceMap.findAll().size());
    }

    @Test
    void delete() {
        ownerServiceMap.delete(ownerServiceMap.findById(ownerId));
        assertEquals(0,ownerServiceMap.findAll().size());
    }

    @Test
    void saveExistingId() {
        long id=2L;
        Owner owner2=Owner.builder().id(id).build();
        Owner saveOwner=ownerServiceMap.save(owner2);
        assertEquals(id,saveOwner.getId());
    }

    @Test
    void saveNoId(){
        Owner savedOwner=ownerServiceMap.save(Owner.builder().build());
        assertNotNull(savedOwner);
        assertNotNull(savedOwner.getId());
    }

    @Test
    void findById() {
        Owner owner = ownerServiceMap.findById(ownerId);

        assertEquals(ownerId,owner.getId());
    }

    @Test
    void findByLastName() {

        Owner smith = ownerServiceMap.findByLastName(lastName);
        assertNotNull(smith);

        assertEquals(lastName,smith.getLastName());
        assertEquals(ownerId,smith.getId());
    }
    @Test
    void findByLastNameNull(){
        Owner smith = ownerServiceMap.findByLastName("foo");
        assertNull(smith);
    }
}