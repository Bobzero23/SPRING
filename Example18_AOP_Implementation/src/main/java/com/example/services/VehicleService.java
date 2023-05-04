package com.example.services;


import com.example.interfaces.Speakers;
import com.example.interfaces.Tyres;
import com.example.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class VehicleService {

    /**initializing the Logger*/
    private Logger logger = Logger.getLogger(VehicleService.class.getName());

    @Autowired
    private Speakers speakers;
    private Tyres tyres;


    /**method to play music when the vehicle started*/
    public String playMusic(boolean vehicleStarted, Song song) {
        return speakers.makeSound(song);
    }


    /**method to move vehicle when the vehicle started*/
    public String moveVehicle(boolean vehicleStarted){
        throw new NullPointerException("For the testing purpose...");
    }

    /**method to apply break when the vehicle started*/
    public String applyBrake(boolean vehicleStarted){
        return tyres.stop();
    }

    public void moveVehicle() {
        String status = tyres.rotate();
        System.out.println(status);
    }

    public Speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public Tyres getTyres() {
        return tyres;
    }

    @Autowired
    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}
