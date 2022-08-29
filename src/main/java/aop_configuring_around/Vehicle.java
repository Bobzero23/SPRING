package aop_configuring_around;

/*imports*/
import bean13_assignment.Speakers;
import bean13_assignment.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
/*pojo bean class for vehicle*/
public class Vehicle {

    /*initialing object of the Logger with get logger method*/
    private Logger logger = Logger.getLogger(Vehicle.class.getName());

    @Autowired
    private Speakers speakers;
    private Tyres tyres;

    /*method to play the song*/
    public String playMusic(boolean vehicleStarted, Song song){
        return speakers.makeSound(song);
    }

    /*method to moveVehicle*/
    public String moveVehicle(boolean vehicleStarted){
        return tyres.rotate();
    }

    /*method to stop the vehicle*/
    public String applyBrake(boolean vehicleStarted){
        return tyres.stop();
    }

    /*getter for speakers*/
    public Speakers getSpeakers(){
        return speakers;
    }

    /*setter for speakers*/
    public void setSpeakers(Speakers speakers){
        this.speakers = speakers;
    }

    /*getter for tyres*/
    public Tyres getTyres(){
        return  tyres;
    }

    /*setter for tyres*/
    public void setTyres(Tyres tyres){
        this.tyres = tyres;
    }



}
