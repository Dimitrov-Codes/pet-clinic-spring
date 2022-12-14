package com.example.petclinicspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class PetClinicSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetClinicSpringApplication.class, args);
        System.out.println("http://localhost:8080");
    }

    @RequestMapping("/error")
    public String getError(Model model) {

        return "error";
    }
}
