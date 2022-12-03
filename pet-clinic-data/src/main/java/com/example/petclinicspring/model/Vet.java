package com.example.petclinicspring.model;

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person {
    private Set<Specialty> specialties = new HashSet<>();

    public Vet(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String toString() {
        return "Vet:{" +
                "firstName=" + getFirstName() + ", " +
                "lastName=" + getLastName() + ", " +
                "specialties=" + specialties +
                "} ";
    }

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }
}
