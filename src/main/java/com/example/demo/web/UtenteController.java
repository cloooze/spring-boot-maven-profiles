package com.example.demo.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Utente;
import com.example.demo.repository.UtenteRepository;

@RestController
public class UtenteController {
	
	@Autowired
	UtenteRepository repo;
	
	@GetMapping("/get/{id}")
	public Optional<Utente> get(@PathVariable Long id) {
		return repo.findById(id);
	}

}
