package com.example.Example_SimpleWebApp.config;


import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Controller;

@Controller
public class ProjSecurityConfig {
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
       http.csrf().disable()
               .authorizeHttpRequests()
               .requestMatchers("/home").permitAll()
               .requestMatchers("/holidays").permitAll()
               .requestMatchers("/contact").permitAll()
               .requestMatchers("/saveMsg").permitAll()
               .requestMatchers("/courses").permitAll()
               .requestMatchers("/about").permitAll()
               .requestMatchers("/assets/**").permitAll()
               .and().formLogin().and().httpBasic();
       return http.build();
    }

}
