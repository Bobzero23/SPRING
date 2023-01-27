package com.example.beans;

public class Vehicle {

    public String name;

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
