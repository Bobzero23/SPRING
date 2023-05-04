package com.solution.main;

import com.solution.beans.Person;
import com.solution.beans.Vehicle;
import com.solution.configs.ProjConfig;
import com.solution.model.Song;
import com.solution.services.VehicleService;
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
        String moveVehicleStatus = vehicleService.moveVehicle(true);
        System.out.println(moveVehicleStatus);
        String playMusicStatus = vehicleService.playMusic(vehicleStarted, song);
        System.out.println(playMusicStatus);
        String applyBreakStatus = vehicleService.applyBrake(vehicleStarted);
        System.out.println(applyBreakStatus);
    }
}
