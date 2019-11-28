package com.petclinic.drdolittle.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "specialties")
public class Specialty extends BaseEntity {

    private String description;

    @ManyToMany()
    @JoinTable(name = "vet_specialty"
            ,joinColumns = @JoinColumn(name = "specialty_id",referencedColumnName = "id")
            ,inverseJoinColumns = @JoinColumn(name = "vet_id",referencedColumnName = "id"))
    private Set<Vet> vets;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Vet> getVets() {
        return vets;
    }

    public void setVets(Set<Vet> vets) {
        this.vets = vets;
    }
}
