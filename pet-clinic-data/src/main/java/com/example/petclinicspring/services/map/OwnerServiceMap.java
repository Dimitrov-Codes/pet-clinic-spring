package com.example.petclinicspring.services.map;

import com.example.petclinicspring.model.Owner;
import com.example.petclinicspring.services.CrudService;
import com.example.petclinicspring.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner> implements OwnerService {
}
