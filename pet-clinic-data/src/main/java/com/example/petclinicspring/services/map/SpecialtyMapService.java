package com.example.petclinicspring.services.map;

import com.example.petclinicspring.model.Specialty;
import com.example.petclinicspring.services.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class SpecialtyMapService extends AbstractMapService<Specialty> implements SpecialtyService {
}
