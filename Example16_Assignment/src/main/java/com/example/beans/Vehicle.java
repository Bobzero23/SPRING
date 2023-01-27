package com.example.beans;

import com.example.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name = "Lamborghini";
    private final VehicleService vehicleService;

    @Autowired
    public Vehicle(VehicleService vehicleService){
        this.vehicleService = vehicleService;
    }

    @Override
    public String toString(){
        return name;
    }

    public VehicleService getVehicleService() {
        return vehicleService;
    }

}
