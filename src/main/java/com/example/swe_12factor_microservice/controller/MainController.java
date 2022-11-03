package com.example.swe_12factor_microservice.controller;

import com.example.swe_12factor_microservice.services.MyMainService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    private MyMainService myMainService;

    @PostMapping("/create")
    public String getArtikel(String name){
        return myMainService.getArtikel(name);
    }
    @GetMapping("/create")
    public void createArtikel(String name, Float count){

    }
}
