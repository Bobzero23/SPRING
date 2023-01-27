package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    public String name = "Lamborghini";

    public Vehicle() {
        System.out.println("Vehicle bean is created by Spring..");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
