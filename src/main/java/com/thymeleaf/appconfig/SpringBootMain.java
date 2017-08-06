package com.thymeleaf.appconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.thymeleaf")
public class SpringBootMain {
	public static void main(String args[]){
		SpringApplication.run(SpringBootMain.class, args);
	}
}
