package com.example.petclinicspring.services;

import com.example.petclinicspring.model.Pet;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public interface PetService extends CrudService<Pet>{
}
