package com.example.petclinicspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping({"/", "", "index", "index.html"})
    public String getIndex(){
        return "index";
    }


}
