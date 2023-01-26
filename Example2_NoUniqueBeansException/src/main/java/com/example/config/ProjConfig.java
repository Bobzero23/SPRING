package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjConfig {

    @Bean
    Vehicle vehicle1(){
        Vehicle veh = new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }

    @Bean
    Vehicle vehicle2(){
        Vehicle veh = new Vehicle();
        veh.setName("BMW");
        return veh;
    }

    @Bean
    Vehicle vehicle3(){
        Vehicle veh = new Vehicle();
        veh.setName("LAMBO");
        return veh;
    }

    @Bean
    String hello(){
        return "Hello world";
    }

    @Bean
    Integer number (){
        return 23;
    }
}
