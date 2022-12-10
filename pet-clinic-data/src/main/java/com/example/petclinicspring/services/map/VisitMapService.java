package com.example.petclinicspring.services.map;

import com.example.petclinicspring.model.Visit;
import com.example.petclinicspring.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class VisitMapService extends AbstractMapService<Visit> implements VisitService {
}
