package com.example.petclinicspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vet")
public class VetController {
    @RequestMapping({"", "/"})
    public String getVetIndex() {
        return "vetIndex";
    }
}
