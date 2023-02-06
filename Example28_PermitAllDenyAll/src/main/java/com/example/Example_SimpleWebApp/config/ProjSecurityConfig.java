package com.example.Example_SimpleWebApp.config;


import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Controller;

@Controller
public class ProjSecurityConfig {
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {

        // Permit All Requests inside the Web Application
        http.authorizeHttpRequests().anyRequest().permitAll().
                and().formLogin()
                .and().httpBasic();

        // Deny All Requests inside the Web Application
            /*http.authorizeHttpRequests().anyRequest().denyAll().
                    and().formLogin()
                    .and().httpBasic();*/

        return http.build();

    }

}
