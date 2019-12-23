package com.petclinic.drdolittle.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


@Setter
@Getter
@NoArgsConstructor
//@AllArgsConstructor
//@Builder
@Entity
@Table(name = "pets")
public class Pet extends BaseEntity {


    @Builder
    public Pet(Long id, String name, PetType petType,
               Owner owner,LocalDate birthDate
            ,Set<Visit> visits) {

        super(id);

        this.name=name;
        this.petType=petType;
        this.owner=owner;
        this.birthDate=birthDate;

        if(visits !=null || visits.size()>0) {
            this.visits = visits;
        }
    }



    private String name;

    @ManyToOne
    @JoinColumn(name = "type_id",referencedColumnName = "id")
    private PetType petType;

    @ManyToOne
    @JoinColumn(name = "owner_id",referencedColumnName = "id")
    private Owner owner;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")
    private Set<Visit> visits=new HashSet<>();

    private LocalDate birthDate;



//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public PetType getPetType() {
//        return type;
//    }
//
//    public void setPetType(PetType petType) {
//        this.type = petType;
//    }
//
//    public Owner getOwner() {
//        return owner;
//    }
//
//    public void setOwner(Owner owner) {
//        this.owner = owner;
//    }
//

//
//    public PetType getType() {
//        return type;
//    }
//
//    public void setType(PetType type) {
//        this.type = type;
//    }
//
//    public Set<Visit> getVisits() {
//        return visits;
//    }
//
//    public void setVisits(Set<Visit> visits) {
//        this.visits = visits;
//    }
}
