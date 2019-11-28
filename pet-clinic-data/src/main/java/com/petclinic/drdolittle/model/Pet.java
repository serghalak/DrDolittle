package com.petclinic.drdolittle.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "pets")
public class Pet extends BaseEntity {

    private String name;

    @ManyToOne
    @JoinColumn(name = "type_id",referencedColumnName = "id")
    private PetType type;

    @ManyToOne
    @JoinColumn(name = "owner_id",referencedColumnName = "id")
    private Owner owner;

    @OneToOne
    private Visit visit;

    private LocalDate birthDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PetType getPetType() {
        return type;
    }

    public void setPetType(PetType petType) {
        this.type = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
