package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.InterruptedIOException;

@Configuration
public class ProjConfig {

    @Bean
    Vehicle vehicle(){
        Vehicle veh = new Vehicle();
        veh.setName("Audi 8");
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
