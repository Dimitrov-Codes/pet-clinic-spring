package com.example.petclinicspring.services.map;

import com.example.petclinicspring.model.Vet;
import com.example.petclinicspring.services.VetService;
import org.springframework.stereotype.Service;

@Service

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
}
