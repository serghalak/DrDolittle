package com.petclinic.drdolittle.model;

import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "types")
public class PetType extends BaseEntity{

    private String name;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "petType")
    private Set<Pet> pet;

    @Override
    public String toString() {
        return name;
    }

    //    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Set<Pet> getPet() {
//        return pet;
//    }
//
//    public void setPet(Set<Pet> pet) {
//        this.pet = pet;
//    }
}
