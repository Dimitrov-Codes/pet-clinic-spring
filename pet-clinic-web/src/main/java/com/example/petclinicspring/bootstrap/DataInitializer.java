package com.example.petclinicspring.bootstrap;

import com.example.petclinicspring.model.*;
import com.example.petclinicspring.services.OwnerService;
import com.example.petclinicspring.services.PetTypeService;
import com.example.petclinicspring.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataInitializer implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataInitializer(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        petTypeService.save(cat);


        Owner owner1 = new Owner("Micheal", "Keaton", "Shollinganallur", "Chennai", "+919884944786");

        Pet costco = new Pet(dog, owner1, LocalDate.of(2002, 3, 8));
        Pet julie = new Pet(cat, owner1, LocalDate.of(2012, 11, 10));

        owner1.getPets().add(costco);
        owner1.getPets().add(julie);

        ownerService.save(owner1);

        Owner owner2 = new Owner("Keegan", "Micheal", "San Jose", "California", "+919332655123");

        Pet ruri = new Pet(cat, owner2, LocalDate.of(2011, 7, 26));
        Pet zoro = new Pet(cat, owner2, LocalDate.of(2015, 11, 14));

        owner2.getPets().add(ruri);
        owner2.getPets().add(zoro);

        ownerService.save(owner2);

        Specialty surgeon = new Specialty("Surgeon");
        Specialty exoticAnimal = new Specialty("Experience with exotic and undomesticated pets");


        Vet vet1 = new Vet("Yung", "Bean");
        vet1.getSpecialties().add(surgeon);
        vetService.save(vet1);

        Vet vet2 = new Vet("Moar", "Groovy");
        vet2.getSpecialties().add(exoticAnimal);
        vetService.save(vet2);

        System.out.println(owner1 + "\n");
        System.out.println(owner2 + "\n");
        System.out.println(vet1 + "\n");
        System.out.println(vet2 + "\n");
        System.out.println(dog + "\n");
        System.out.println(cat + "\n");
    }
}
