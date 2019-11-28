package com.petclinic.drdolittle.repositories;

import com.petclinic.drdolittle.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
