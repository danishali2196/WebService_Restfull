package com.nit.sbapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@ComponentScan(basePackages="com.nit.*")
public class RestProj19SpringIntigrationSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestProj19SpringIntigrationSpringbootApplication.class, args);
	}

}
