package com.example.service;


import com.example.interfaces.Speakers;
import com.example.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleService  {
    private  Tyres tyres;
    private  Speakers speakers;

    @Autowired
    public VehicleService(Tyres tyres, Speakers speakers){
        this.tyres = tyres;
        this.speakers = speakers;
    }

    public Speakers getSpeakers(){
        return speakers;
    }

    public Tyres getTyres(){
        return tyres;
    }

    public void switchSpeaker(Speakers speakers) {
        this.speakers = speakers;
    }

    public void switchTyres(Tyres tyres) {
        this.tyres = tyres;
    }

}
