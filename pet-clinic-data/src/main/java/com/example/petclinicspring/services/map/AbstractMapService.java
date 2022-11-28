package com.example.petclinicspring.services.map;

import com.example.petclinicspring.services.CrudService;

import java.util.HashMap;
import java.util.HashSet;

public abstract class AbstractMapService<T, ID> implements CrudService<T, ID> {
    protected HashMap<ID, T> map = new HashMap<>();

    public HashSet<T> findAll() {
        return new HashSet<>(map.values());
    }

    public T findById(ID id) {
        return map.get(id);
    }

    public T save(ID id, T object) {
        map.put(id, object);
        return object;
    }

    public T deleteById(ID id) {
        T object = map.get(id);
        if (map.containsKey(id)) {
            map.remove(id);
        } else {
            throw new RuntimeException(id + "does not exist");
        }
        return object;
    }

    public T delete(T object) {
        if (map.containsValue(object)) {
            map.entrySet().removeIf(entry -> entry.getValue() == object);
        } else {
            throw new RuntimeException(object + "does not exist");
        }
        return object;
    }
}
