package com.kh.app11;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan
public class App11Application {

	public static void main(String[] args) {
		SpringApplication.run(App11Application.class, args);
	}

}
