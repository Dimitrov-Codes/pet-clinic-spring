package com.example.petclinicspring.repositories;

import com.example.petclinicspring.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet,Long> {
}
