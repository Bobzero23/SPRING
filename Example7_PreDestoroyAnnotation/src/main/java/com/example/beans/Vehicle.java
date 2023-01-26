package com.example.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Vehicle {

    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void initialize() {
        this.name = "Ferrari";
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Clearing the Vehicle Bean");
    }

    public void hello() {
        System.out.println("Printing Hello from the Component vehicle bean..");
    }
}
