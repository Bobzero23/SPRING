package com.example.Example_SimpleWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.Example_SimpleWebApp.repository")
@EntityScan("com.example.Example_SimpleWebApp.model")
public class EazySchoolWebAppApplication{

	public static void main(String[] args) {
		SpringApplication.run(EazySchoolWebAppApplication.class, args);
	}

}
