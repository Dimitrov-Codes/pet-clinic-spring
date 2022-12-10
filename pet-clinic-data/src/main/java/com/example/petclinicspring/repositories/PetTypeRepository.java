package com.example.petclinicspring.repositories;

import com.example.petclinicspring.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
