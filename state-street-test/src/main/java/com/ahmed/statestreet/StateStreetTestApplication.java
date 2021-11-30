package com.ahmed.statestreet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;

@SpringBootApplication
public class StateStreetTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(StateStreetTestApplication.class, args);
	}

}
