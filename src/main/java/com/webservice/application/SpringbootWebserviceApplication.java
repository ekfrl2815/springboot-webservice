package com.webservice.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.webservice")
public class SpringbootWebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebserviceApplication.class, args);
	}
}
