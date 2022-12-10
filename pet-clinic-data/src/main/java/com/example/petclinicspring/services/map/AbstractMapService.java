package com.example.petclinicspring.services.map;

import com.example.petclinicspring.model.BaseEntity;
import com.example.petclinicspring.services.CrudService;

import java.util.HashMap;
import java.util.HashSet;

public abstract class AbstractMapService<T extends BaseEntity> implements CrudService<T> {
    protected HashMap<Long, T> map = new HashMap<>();

    public HashSet<T> findAll() {
        return new HashSet<>(map.values());
    }

    public T findById(Long id) {
        return map.get(id);
    }

    public T save(T object) {
        object.setId(generateId());
        map.put(object.getId(), object);
        return object;
    }

    private Long generateId() {
        return (long)(map.size() + 1);
    }

    public void deleteById(Long id) {
        T object = map.get(id);
        if (map.containsKey(id)) {
            map.remove(id);
        } else {
            throw new RuntimeException(id + "does not exist");
        }
    }

    public void delete(T object) {
        if (map.containsValue(object)) {
            map.entrySet().removeIf(entry -> entry.getValue() == object);
        } else {
            throw new RuntimeException(object + "does not exist");
        }

    }
}
