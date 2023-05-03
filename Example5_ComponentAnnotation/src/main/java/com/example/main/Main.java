package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        /**Using Spring Beans*/
        var context = new AnnotationConfigApplicationContext(ProjConfig.class);
        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("The bean of the IoC Container is: " + veh.getName());
        veh.hello();
    }
}