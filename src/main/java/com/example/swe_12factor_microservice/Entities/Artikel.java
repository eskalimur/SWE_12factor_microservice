package com.example.swe_12factor_microservice.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Artikel {

    private Long id;
    private String name;
    private Float count;
    private Kategorie kategorie;

    public Artikel() {
    }
    public Artikel(String name, Long category, Float count) {
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public Float getCount() {
        return count;
    }

    public void setCount(Float count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
