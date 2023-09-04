package com.backend.campersapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.modelmapper.ModelMapper;

@SpringBootApplication
public class CampersApiApplication {
	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(CampersApiApplication.class, args);
	}

}
