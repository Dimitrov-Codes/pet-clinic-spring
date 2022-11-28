package com.example.petclinicspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/owner")
@Controller
public class OwnerController {
    @RequestMapping({"", "/"})
    public String getOwnerIndex(){
        return "ownerIndex";
    }
}
