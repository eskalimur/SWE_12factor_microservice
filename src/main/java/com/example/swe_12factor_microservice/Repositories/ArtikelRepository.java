package com.example.swe_12factor_microservice.Repositories;

import com.example.swe_12factor_microservice.Entities.Artikel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtikelRepository extends CrudRepository<Artikel, Long> {
}
