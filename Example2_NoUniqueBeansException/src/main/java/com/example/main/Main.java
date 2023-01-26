package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        /**A normal Java object */
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda");
        System.out.println("This bean of the normal Java class is : " + vehicle.getName());

        /**Using Spring Beans*/
        var context = new AnnotationConfigApplicationContext(ProjConfig.class);
        Vehicle veh = context.getBean("vehicle1", Vehicle.class);
        System.out.println("The bean of the IoC Container is: " + veh.getName());

        String hello = context.getBean(String.class);
        System.out.println("The String bean of the IoC Container is: " + hello);

        Integer number = context.getBean(Integer.class);
        System.out.println("The Integer bean of the IoC Container is: " + number);
    }
}