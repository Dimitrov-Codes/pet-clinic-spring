package com.example.petclinicspring.services.map;

import com.example.petclinicspring.model.Pet;

import java.util.HashSet;

public class PetServiceMap extends AbstractMapService<Pet, Long>{
    @Override
    public HashSet<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Pet save(Long aLong, Pet object) {
        return super.save(aLong, object);
    }

    @Override
    public Pet deleteById(Long aLong) {
        return super.deleteById(aLong);
    }

    @Override
    public Pet delete(Pet object) {
        return super.delete(object);
    }
}
