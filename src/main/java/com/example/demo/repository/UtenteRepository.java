package com.example.demo.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Utente;

@Repository
public interface UtenteRepository extends GenericEntityRepository<Utente> {
	
	public Optional<Utente> findByCognome(String nome);

}
