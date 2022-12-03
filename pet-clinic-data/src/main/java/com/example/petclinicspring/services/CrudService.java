package com.example.petclinicspring.services;

import com.example.petclinicspring.model.BaseEntity;

import java.util.HashSet;
import java.util.Set;

public interface CrudService<T extends BaseEntity> {
    HashSet<T> findAll();

    T findById(Long id);

    T save(T object);

    T deleteById(Long id);

    T delete(T object);
}
