package com.example.petclinicspring.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "owners")
public class Owner extends Person {

    private String address;
    private String city;
    private String phone;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Pet> pets = new HashSet<>();
    @Builder
    public Owner(String firstName, String lastName, String address, String city, String phone) {
        super(firstName, lastName);
        this.address = address;
        this.city = city;
        this.phone = phone;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Owner owner = (Owner) o;
        return getId() != null && Objects.equals(getId(), owner.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
