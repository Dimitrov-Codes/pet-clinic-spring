package com.example.petclinicspring.bootstrap;

import com.example.petclinicspring.model.Owner;
import com.example.petclinicspring.model.Vet;
import com.example.petclinicspring.services.OwnerService;
import com.example.petclinicspring.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataInitializer(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner("Micheal", "Keaton");
        ownerService.save(owner1);

        Owner owner2 = new Owner("Keegan","Micheal");
        ownerService.save(owner2);

        Vet vet1 = new Vet("Yung", "Bean");
        vetService.save(vet1);

        Vet vet2 = new Vet("Moar", "Groovy");
        vetService.save(vet2);

        System.out.println(owner1);
        System.out.println(owner2);
        System.out.println(vet1);
        System.out.println(vet2);
    }
}
