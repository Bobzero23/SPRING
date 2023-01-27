package com.example.beans;

public class Person {
    public String name;
    public Vehicle vehicle;

    public Person() {
        System.out.println("Person bean created by Spring..");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
