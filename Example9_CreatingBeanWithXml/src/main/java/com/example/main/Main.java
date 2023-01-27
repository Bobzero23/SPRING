package com.example.main;

import com.example.beans.Vehicle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("beans.xml");
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("The name of the bean created is: " + vehicle.getName());
    }
}
