package com.example.petclinicspring.repositories;

import com.example.petclinicspring.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
