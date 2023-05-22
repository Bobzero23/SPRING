package com.example.Example_SimpleWebApp.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class ProjSecurityConfig {
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
       http.csrf().disable()
               .authorizeHttpRequests()
               .requestMatchers("/dashboard").authenticated() //new
               .requestMatchers("/home").permitAll()
               .requestMatchers("/holidays/**").permitAll()
               .requestMatchers("/contact").authenticated()
               .requestMatchers("/saveMsg").denyAll()
               .requestMatchers("/courses").permitAll()
               .requestMatchers("/about").permitAll()
               .requestMatchers("/login").permitAll() //new
               .requestMatchers("/assets/**").permitAll()
               .and().formLogin().loginPage("/login")
               .defaultSuccessUrl("/dashboard").failureUrl("/login?error=true").permitAll()
               .and().logout().logoutSuccessUrl("/login?logout=true").invalidateHttpSession(true).permitAll()
               .and().httpBasic();
       return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        PasswordEncoder passwordEncoder = passwordEncoder();

        UserDetails admin = User.builder()
                .username("user")
                .password(passwordEncoder().encode("12345"))
                .roles("USER")
                .build();
        UserDetails user = User.builder()
                .username("admin")
                .password(passwordEncoder().encode("54321"))
                .roles("USER","ADMIN")
                .build();
        UserDetails bob = User.builder()
                .username("Bobzero")
                .password(passwordEncoder().encode("415415"))
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(user, admin, bob);
    }

}
