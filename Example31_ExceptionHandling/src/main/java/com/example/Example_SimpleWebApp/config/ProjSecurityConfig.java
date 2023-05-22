package com.example.Example_SimpleWebApp.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class ProjSecurityConfig {
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
       http.csrf().disable()
               .authorizeHttpRequests()
               .requestMatchers("/dashboard").authenticated()
               .requestMatchers("/home").permitAll()
               .requestMatchers("/holidays/**").permitAll()
               .requestMatchers("/contact").permitAll()
               .requestMatchers("/saveMsg").permitAll()
               .requestMatchers("/courses").permitAll()
               .requestMatchers("/about").permitAll()
               .requestMatchers("/login").permitAll()
               .requestMatchers("/assets/**").permitAll()
               .and().formLogin().loginPage("/login")
               .defaultSuccessUrl("/dashboard").failureUrl("/login?error=true").permitAll()
               .and().logout().logoutSuccessUrl("/login?logout=true").invalidateHttpSession(true).permitAll()
               .and().httpBasic();
       return http.build();
    }

    @Bean
    public InMemoryUserDetailsManager userDetailsService() {

        UserDetails admin = User.withDefaultPasswordEncoder()
                .username("user")
                .password("12345")
                .roles("USER")
                .build();
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("admin")
                .password("54321")
                .roles("USER","ADMIN")
                .build();
        UserDetails bob = User.withDefaultPasswordEncoder()
                .username("Bobzero")
                .password("415415")
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(user, admin, bob);
    }


    //This one is not being used anymore
 /*   protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication()
                .withUser("user").password("1234").roles("USER")
                .and()
                .withUser("admin").password("4321").roles("USER","ADMIN")
                .and().passwordEncoder(NoOpPasswordEncoder.getInstance());
    }*/
}
