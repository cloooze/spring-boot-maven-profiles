package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Utente;
import com.example.demo.repository.UtenteRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Value("${test.property}")
	private String testProperty;
	
	@Value("${local.property}")
	private String localProperty;
	
	@Autowired
	UtenteRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
//		System.out.println("localProperty: " + localProperty);
//		System.out.println("testProperty: " + testProperty);
		
		Utente utente = new Utente();
		utente.id = 1L;
		utente.nome = "andrea";
		utente.cognome = "braghese";
		
		repo.save(utente);
	}

}
