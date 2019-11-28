package com.petclinic.drdolittle.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "vets")
public class Vet extends Person {

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable( name = "vet_specialty"
            ,joinColumns =@JoinColumn(name="vet_id",referencedColumnName = "id")
            ,inverseJoinColumns = @JoinColumn(name = "specialty_id",referencedColumnName = "id"))
    private Set<Specialty> specialities =new HashSet<>();

    public Set<Specialty> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Specialty> specialities) {
        this.specialities = specialities;
    }
}
