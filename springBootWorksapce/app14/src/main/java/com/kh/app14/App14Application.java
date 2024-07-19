package com.kh.app14;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan
public class App14Application {

	public static void main(String[] args) {
		SpringApplication.run(App14Application.class, args);
	}

}
