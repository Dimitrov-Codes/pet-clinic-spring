package com.example.petclinicspring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "visits")
public class Visit extends BaseEntity {
    private LocalDate date;
    private String desc;
    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Visit visit = (Visit) o;
        return getId() != null && Objects.equals(getId(), visit.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
