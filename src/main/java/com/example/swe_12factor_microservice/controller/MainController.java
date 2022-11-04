package com.example.swe_12factor_microservice.controller;

import com.example.swe_12factor_microservice.Entities.Kategorie;
import com.example.swe_12factor_microservice.services.MyMainService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    private MyMainService myMainService;

    @PostMapping("/create")
    public String getArtikel(Long id){
        return myMainService.getArtikel(id).getName();
    }
    @GetMapping("/create")
    public boolean createArtikel(String name, Long category, Float count){
        return myMainService.createArtikel(name, category, count);
    }
}
