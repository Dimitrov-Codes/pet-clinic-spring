package com.example.petclinicspring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "specialties")
public class Specialty extends BaseEntity {

    private String desc;

    public Specialty(String desc) {
        this.desc = desc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Specialty specialty = (Specialty) o;
        return getId() != null && Objects.equals(getId(), specialty.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
