package com.example.petclinicspring.repositories;

import com.example.petclinicspring.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
