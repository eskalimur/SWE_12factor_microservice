package com.example.swe_12factor_microservice.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Kategorie {

    private Long id;
    private String categoryName;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
