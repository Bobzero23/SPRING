package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name = "Bobzero";
    private Vehicle vehicle;


    public Person(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle(){
        return vehicle;
    }

    public String getName(){
        return name;
    }



}
