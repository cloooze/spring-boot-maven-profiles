package com.example.demo;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@Autowired
	UtenteRepository utenteRepo;
	
	@Autowired
	GruppoRepository gruppoRepo;
	
	@GetMapping("/test")
	public ResponseEntity<?> test() {
		Gruppo gruppo = new Gruppo();
		gruppo.id = 1L;
		gruppo.nome = "gruppo_1";
		Gruppo gruppoSaved = gruppoRepo.save(gruppo);
		
		Utente utente = new Utente();
		utente.id = 1L;
		utente.nome = "andrea";
		utente.cognome = "braghese";
		utente.setGruppo(gruppoSaved);
		
		Utente utenteSaved = utenteRepo.save(utente);
		
		Utente u = utenteRepo.findById(1L).get();
		
		
		CacheControl cacheControl = CacheControl.maxAge(60, TimeUnit.SECONDS);
		
		return ResponseEntity.ok().cacheControl(cacheControl).body("ok");
	}
	

}
