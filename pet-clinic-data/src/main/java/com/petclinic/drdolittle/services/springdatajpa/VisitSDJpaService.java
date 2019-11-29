package com.petclinic.drdolittle.services.springdatajpa;

import com.petclinic.drdolittle.model.Visit;
import com.petclinic.drdolittle.repositories.VisitRepository;
import com.petclinic.drdolittle.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile("springdatajpa")
public class VisitSDJpaService implements VisitService {

    private VisitRepository visitRepository;

    public VisitSDJpaService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        return null;
    }

    @Override
    public Visit findById(Long aLong) {
        return null;
    }

    @Override
    public Visit save(Visit object) {
        return null;
    }

    @Override
    public void delete(Visit object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
