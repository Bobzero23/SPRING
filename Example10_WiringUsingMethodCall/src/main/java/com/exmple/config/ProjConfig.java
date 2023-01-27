package com.exmple.config;

import com.exmple.beans.Person;
import com.exmple.beans.Vehicle;
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
    Person person() {
        Person person = new Person();
        person.setName("Bob");
        person.setVehicle(vehicle()); // wiring
        return person;
    }
}
