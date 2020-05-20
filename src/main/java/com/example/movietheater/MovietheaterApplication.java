package com.example.movietheater;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MovietheaterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovietheaterApplication.class, args);
	}

}
