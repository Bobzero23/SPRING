package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hello() {
        System.out.println("Printing Hello from the Component vehicle bean..");
    }
}
