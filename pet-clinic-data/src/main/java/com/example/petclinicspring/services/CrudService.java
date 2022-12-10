package com.example.petclinicspring.services;

import com.example.petclinicspring.model.BaseEntity;

import java.util.HashSet;

public interface CrudService<T extends BaseEntity> {
    HashSet<T> findAll();

    T findById(Long id);

    T save(T object);

    void deleteById(Long id);

    void delete(T object);
}
