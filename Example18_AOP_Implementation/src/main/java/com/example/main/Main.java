package com.example.main;

import com.example.services.VehicleService;
import com.example.configs.ProjConfig;
import com.solution.model.Song;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjConfig.class);
        var vehicleService = context.getBean(VehicleService.class);
        System.out.println(vehicleService.getClass());
        Song song = new Song();
        song.setTitle("Blank Space");
        song.setSingerName("Tylor Swift");
        boolean vehicleStarted = true;
        String moveVehicleStatus = vehicleService.moveVehicle(vehicleStarted);
        /*String playMusicStatus = vehicleService.playMusic(vehicleStarted, song);
        String applyBreakStatus = vehicleService.applyBrake(vehicleStarted);*/
    }
}
