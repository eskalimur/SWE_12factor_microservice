package com.example.swe_12factor_microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Swe12factorMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Swe12factorMicroserviceApplication.class, args);
    }


    @GetMapping("/calculate")
    public String calculate(@RequestParam(value = "myValue", defaultValue = "0") Float result) {
        return String.format("Calculated: %f", result);
    }
    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

}
