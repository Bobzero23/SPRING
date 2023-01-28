package com.solution.main;

import com.solution.beans.Person;
import com.solution.beans.Vehicle;
import com.solution.configs.ProjConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjConfig.class);
        String[] persons = context.getBeanNamesForType(Person.class);
        Person person = context.getBean(Person.class);
        String[] vehicles = context.getBeanNamesForType(Vehicle.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        vehicle.getVehicleService().moveVehicle();
        vehicle.getVehicleService().playMusic();
    }
}
