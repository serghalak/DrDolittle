package com.petclinic.drdolittle.services.map;


import com.petclinic.drdolittle.model.Visit;
import com.petclinic.drdolittle.repositories.VisitRepository;

import com.petclinic.drdolittle.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VisitMapService extends AbstractMapService<Visit,Long>
        implements VisitService {

    private VisitRepository visitRepository;

    public VisitMapService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Visit save(Visit visit) {
        if(visit.getPet() == null
                || visit.getPet().getOwner() == null
                ||visit.getPet().getId()==null
                || visit.getPet().getOwner().getId()==null){
            throw new RuntimeException("Invalid visit");
        }
        return super.save(visit);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}