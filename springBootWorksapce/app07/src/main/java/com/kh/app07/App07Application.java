package com.kh.app07;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class App07Application {

	public static void main(String[] args) {
		SpringApplication.run(App07Application.class, args);
	}


}