package com.example.petclinicspring.bootstrap;

import com.example.petclinicspring.model.*;
import com.example.petclinicspring.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataInitializer implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtyService;
    private final VisitService visitService;
    public DataInitializer(OwnerService ownerService, VetService vetService,
                           PetTypeService petTypeService, SpecialtyService specialtyService,
                           VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {
        if(petTypeService.findAll().size() == 0) loadData();
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        petTypeService.save(cat);


        Owner owner1 = new Owner("Micheal", "Keaton", "Shollinganallur", "Chennai", "+919884944786");
        System.out.println(Owner.builder().firstName("Kat").lastName("Ty").address("Los InLife").city("Murica").phone("+910937492083"));
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
        Specialty dentistry = new Specialty("Dentistry");
        specialtyService.save(surgeon);
        specialtyService.save(dentistry);


        Vet vet1 = new Vet("Yung", "Bean");
        vet1.getSpecialties().add(dentistry);
        vetService.save(vet1);

        Vet vet2 = new Vet("Moar", "Groovy");
        vet2.getSpecialties().add(surgeon);
        vetService.save(vet2);

        Visit catVisit = new Visit();
        catVisit.setPet(ruri);
        catVisit.setDate(LocalDate.now());
        catVisit.setDesc("Worms in tummy");
        visitService.save(catVisit);

        Visit dogVisit = new Visit();
        dogVisit.setPet(costco);
        dogVisit.setDate(LocalDate.now());
        dogVisit.setDesc("fever");
        visitService.save(dogVisit);

        System.out.println(owner1 + "\n");
        System.out.println(owner2 + "\n");
        System.out.println(vet1 + "\n");
        System.out.println(vet2 + "\n");
        System.out.println(dog + "\n");
        System.out.println(cat + "\n");
        System.out.println(catVisit + "\n");
        System.out.println(dogVisit + "\n");

    }
}
