package com.example.petclinicspring.controllers;

import com.example.petclinicspring.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/owner")
@Controller
public class OwnerController {
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/"})
    public String getOwnerIndex(Model model){
        model.addAttribute("owners", ownerService.findAll());
        return "ownerIndex";
    }
}
