package com.example.main;

import com.example.beans.Person;
import com.example.config.ProjConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjConfig.class);

        Person person = context.getBean(Person.class);

        System.out.println("The Vehicle bean of the person is: " + person.getVehicle());
    }
}
