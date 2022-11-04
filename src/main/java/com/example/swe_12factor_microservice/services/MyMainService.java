package com.example.swe_12factor_microservice.services;

import com.example.swe_12factor_microservice.Entities.Artikel;
import com.example.swe_12factor_microservice.Entities.Kategorie;
import com.example.swe_12factor_microservice.Repositories.ArtikelRepository;
import com.example.swe_12factor_microservice.Repositories.KategorieRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

public class MyMainService {

    private ArtikelRepository artikelRepository;
    private KategorieRepository kategorieRepository;
    public Artikel getArtikel(Long id){
        Optional<Artikel> temp = artikelRepository.findById(id);
        if (temp.isEmpty())
            return null;
        else
            return temp.get();
    }

    public boolean createArtikel(String name, Long category, Float count){
        if(kategorieRepository.findById(category) == null){
            Kategorie k = new Kategorie();
            kategorieRepository.save(k);
        }
        Artikel temp = new Artikel(name, category, count);
        artikelRepository.save(temp);
        return true;
    }
}
