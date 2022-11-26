package com.example.petclinicspring.services;

import java.util.HashSet;
import java.util.Set;

public interface CrudService<T, ID> {
    HashSet<T> findAll();

    T findById(ID id);

    T save(ID id, T object);

    T deleteById(ID id);

    T delete(T object);
}
