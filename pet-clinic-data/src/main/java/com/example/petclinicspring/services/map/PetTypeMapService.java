package com.example.petclinicspring.services.map;

import com.example.petclinicspring.model.PetType;
import com.example.petclinicspring.services.PetService;
import com.example.petclinicspring.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class PetTypeMapService extends AbstractMapService<PetType> implements PetTypeService {

}
