package com.petclinic.drdolittle.model;

import java.util.HashSet;
import java.util.Set;

//@Entity
public class Vet extends Person {

    private Set<Specialty> specialities =new HashSet<>();

    public Set<Specialty> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Specialty> specialities) {
        this.specialities = specialities;
    }
}
