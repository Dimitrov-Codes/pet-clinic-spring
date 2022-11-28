package com.example.petclinicspring.services;

import com.example.petclinicspring.model.Owner;
import org.springframework.stereotype.Service;


@Service
public interface OwnerService extends CrudService<Owner, Long> {

}
