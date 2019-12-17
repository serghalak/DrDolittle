package com.petclinic.drdolittle.controllers;

import com.petclinic.drdolittle.model.Owner;
import com.petclinic.drdolittle.model.PetType;
import com.petclinic.drdolittle.services.OwnerService;
import com.petclinic.drdolittle.services.PetService;
import com.petclinic.drdolittle.services.PetTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
@RequestMapping("/owners")
public class PetController {

    private static final String VIEWS_PETS_CREATE_OR_UPDATE_FORM=
            "pets/createOrUpdatePetForm";

    private PetService petService;
    private OwnerService ownerService;
    private PetTypeService petTypeService;


    public PetController(PetService petService, OwnerService ownerService, PetTypeService petTypeService) {
        this.petService = petService;
        this.ownerService = ownerService;
        this.petTypeService = petTypeService;
    }

    @ModelAttribute("types")
    public Collection<PetType>populatePetType(){
        return petTypeService.findAll();
    }

    @ModelAttribute("owner")
    public Owner findOwner(@PathVariable("ownerId") long ownerId){
        return ownerService.findById(ownerId);
    }

    @InitBinder("owner")
    public void initOwnerBinder(WebDataBinder dataBinder){
        dataBinder.setDisallowedFields("id");
    }



}
