package com.petclinic.drdolittle.model;

import javax.persistence.Entity;
import java.util.Set;

//@Entity
public class Vet extends Person {

    private Set<Specialty> specialities;

    public Set<Specialty> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Specialty> specialities) {
        this.specialities = specialities;
    }
}
