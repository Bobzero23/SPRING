package com.example.main;

import com.example.beans.Person;
import com.example.config.ProjConfig;
import com.example.implementation.MichelinTyres;
import com.example.implementation.SonySpeakers;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjConfig.class);
        Person person = context.getBean(Person.class);
        System.out.println("The name of the " + person.getName() + "'s car is " + person.getVehicle());

        SonySpeakers sonySpeakers = context.getBean(SonySpeakers.class);
        person.getVehicle().getVehicleService().switchSpeaker(sonySpeakers);

        MichelinTyres michelinTyres = context.getBean(MichelinTyres.class);
        person.getVehicle().getVehicleService().switchTyres(michelinTyres);

        person.getVehicle().getVehicleService().getSpeakers().makeSound();
        person.getVehicle().getVehicleService().getTyres().rotate();

    }
}
