package com.example.petclinicspring.services.map;

import com.example.petclinicspring.model.Owner;
import com.example.petclinicspring.services.CrudService;

import java.util.HashSet;


public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {
    @Override
    public HashSet<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Owner save(Long aLong, Owner object) {
        return super.save(aLong, object);
    }

    @Override
    public Owner deleteById(Long aLong) {
        return super.deleteById(aLong);
    }

    @Override
    public Owner delete(Owner object) {
        return super.delete(object);
    }
}
