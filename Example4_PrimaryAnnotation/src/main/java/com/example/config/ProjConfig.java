package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjConfig {

    @Bean("Audi")
    Vehicle vehicle1(){
        Vehicle veh = new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }

    @Bean("BMW")
    Vehicle vehicle2(){
        Vehicle veh = new Vehicle();
        veh.setName("BMW");
        return veh;
    }

    @Primary
    @Bean("LAMBO")
    Vehicle vehicle3(){
        Vehicle veh = new Vehicle();
        veh.setName("LAMBORGHINI");
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
