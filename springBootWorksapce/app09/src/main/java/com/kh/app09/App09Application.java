package com.kh.app09;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan
public class App09Application {

	public static void main(String[] args) {
		SpringApplication.run(App09Application.class, args);
	}

}
