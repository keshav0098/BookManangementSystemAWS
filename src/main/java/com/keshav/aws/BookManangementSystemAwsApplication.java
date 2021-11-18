package com.keshav.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BookManangementSystemAwsApplication extends SpringBootServletInitializer{
	
	public static void main(String[] args) {
		SpringApplication.run(BookManangementSystemAwsApplication.class, args);
	}

}
