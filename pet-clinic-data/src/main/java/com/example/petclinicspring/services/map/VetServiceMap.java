package com.example.petclinicspring.services.map;

import com.example.petclinicspring.model.Vet;
import com.example.petclinicspring.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class VetServiceMap extends AbstractMapService<Vet> implements VetService {
}
