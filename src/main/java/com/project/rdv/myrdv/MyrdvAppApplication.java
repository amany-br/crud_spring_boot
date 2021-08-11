package com.project.rdv.myrdv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.project.rdv.entities"})  // scan JPA entities

public class MyrdvAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyrdvAppApplication.class, args);
    }

}
