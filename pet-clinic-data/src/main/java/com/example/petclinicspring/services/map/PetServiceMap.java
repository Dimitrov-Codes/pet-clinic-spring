package com.example.petclinicspring.services.map;

import com.example.petclinicspring.model.Pet;
import com.example.petclinicspring.services.PetService;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service

public class PetServiceMap extends AbstractMapService<Pet> implements PetService {

}
