package com.example.config;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjConfig {

    @Bean
    Vehicle vehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Lamborghini");
        return vehicle;
    }

    @Bean
    Person person(Vehicle vehicle) {
        Person person = new Person();
        person.setName("Bob");
        person.setVehicle(vehicle);
        return person;
    }
}
