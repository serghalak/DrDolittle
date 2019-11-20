package com.petclinic.drdolittle.services.map;

import com.petclinic.drdolittle.model.Owner;
import com.petclinic.drdolittle.services.CrudService;
import com.petclinic.drdolittle.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner,Long>
        implements OwnerService {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(),owner);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        //map.containsValue()
        //map.forEach((id, owner) -> if(ow));
        //map.entrySet().forEach() .removeIf(entry ->entry.getValue().equals(object));
         return null;
    }
}
