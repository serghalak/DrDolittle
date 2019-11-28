package com.petclinic.drdolittle.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "types")
public class PetType extends BaseEntity{

    private String name;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "type")
    private Set<Pet> pet;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Set<Pet> getPet() {
        return pet;
    }

    public void setPet(Set<Pet> pet) {
        this.pet = pet;
    }
}
