package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Value("${test.property}")
	private String testProperty;
	
	@Value("${local.property}")
	private String localProperty;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("localProperty: " + localProperty);
		System.out.println("testProperty: " + testProperty);
		
	}

}
