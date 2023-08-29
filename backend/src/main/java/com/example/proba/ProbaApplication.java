package com.example.proba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //( scanBasePackages = {"com.example.proba.dao", "com.example.proba.entity", "com.example.proba.service"})
public class ProbaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProbaApplication.class, args);
    }

}
