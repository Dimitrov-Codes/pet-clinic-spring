package com.example.petclinicspring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "types")
public class PetType extends BaseEntity {

    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PetType petType = (PetType) o;
        return getId() != null && Objects.equals(getId(), petType.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
