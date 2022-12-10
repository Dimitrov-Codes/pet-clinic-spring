package com.example.petclinicspring.repositories;

import com.example.petclinicspring.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
