package com.example.petclinicspring.repositories;

import com.example.petclinicspring.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner,Long> {
}
