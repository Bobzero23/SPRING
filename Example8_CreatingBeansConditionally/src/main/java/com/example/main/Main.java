package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        /**creating object of the context application*/
        var context = new AnnotationConfigApplicationContext(ProjConfig.class);

        Vehicle volkswagen = new Vehicle();
        volkswagen.setName("Volkswagen");
        Supplier<Vehicle> volkswagenSupplier = () -> volkswagen;

        Supplier<Vehicle> audiSupplier = () -> {
            Vehicle audi = new Vehicle();
            audi.setName("Audi");
            return audi;
        };

        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println("The random number created is: " + randomNumber);
        if (randomNumber % 2 == 0) {
            context.registerBean("Volkswagen", Vehicle.class, volkswagenSupplier);
        }else {
            context.registerBean("Audi", Vehicle.class, audiSupplier);
        }

        Vehicle volkswagenVehicle = null;
        Vehicle audiVehicle = null;

        try {
            volkswagenVehicle = context.getBean("Volkswagen", Vehicle.class);
        }catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
            System.out.println("Error while creating volkswagen vehicle");
        }

        try {
            audiVehicle = context.getBean("Audi", Vehicle.class);
        }catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
            System.out.println("Error while creating audi vehicle");
        }

        if (audiVehicle != null) {
            System.out.println("The bean inside the Spring context is: " + audiVehicle.getName());
        }else {
            System.out.println("The bean inside the Spring context is: " + volkswagenVehicle.getName());
        }
    }
}



