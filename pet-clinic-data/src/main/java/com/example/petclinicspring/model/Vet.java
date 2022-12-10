package com.example.petclinicspring.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "vets")
public class Vet extends Person {
    @ManyToMany
    @JoinTable(name = "vet_specialties", joinColumns = @JoinColumn(name = "vet_id"),
            inverseJoinColumns = @JoinColumn(name = "specialty_id"))
    @ToString.Exclude
    private Set<Specialty> specialties = new HashSet<>();

    public Vet(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Vet vet = (Vet) o;
        return getId() != null && Objects.equals(getId(), vet.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
