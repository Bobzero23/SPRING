package com.solution.services;


import com.solution.interfaces.Speakers;
import com.solution.interfaces.Tyres;
import com.solution.model.Song;
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
        Instant start = Instant.now();
        logger.info("Method execution started");
        String music = null;
        if (vehicleStarted) {
            music = speakers.makeSound(song);
        }else {
            logger.log(Level.SEVERE,"Vehicle not started to perform the operation");
        }
        logger.info("Method execution end");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute the method is: " + timeElapsed);
        return music;
    }


    /**method to move vehicle when the vehicl   e started*/
    public String moveVehicle(boolean vehicleStarted){
        Instant start = Instant.now();
        logger.info("method execution start");
        String status = null;
        if(vehicleStarted){
            status = tyres.rotate();
        }else{
            logger.log(Level.SEVERE,"Vehicle not started to perform the" +
                    " operation");
        }
        logger.info("method execution end");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute the method : "+timeElapsed);
        return status;
    }


    /**method to apply break when the vehicle started*/
    public String applyBrake(boolean vehicleStarted){
        Instant start = Instant.now();
        logger.info("method execution start");
        String status = null;
        if(vehicleStarted){
            status = tyres.stop();
        }else{
            logger.log(Level.SEVERE,"Vehicle not started to perform the" +
                    " operation");
        }
        logger.info("method execution end");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute the method : "+timeElapsed);
        return status;
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
