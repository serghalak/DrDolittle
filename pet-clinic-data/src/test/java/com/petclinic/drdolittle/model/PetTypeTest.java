package com.petclinic.drdolittle.model;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetTypeTest {

    PetType petType=new PetType();

//    @Before
//    public void setUp(){
//        petType=new PetType();
//    }

    @Test
    void setName() {
        String name="Dog";

        petType.setName(name);

        assertEquals(name,petType.getName());
    }

    @Test
    void setPet() {
    }

    @Test
    void builder() {
    }

    @Test
    void getName() {
    }

    @Test
    void getPet() {
    }


}