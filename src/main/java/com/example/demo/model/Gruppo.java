package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Gruppo {
	
	@Id
	public Long id;
	
	public String nome;
	
	@OneToMany(mappedBy="gruppo")
	public List<Utente> utenti = new ArrayList<Utente>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Utente> getUtenti() {
		return utenti;
	}

	public void setUtenti(List<Utente> utenti) {
		this.utenti = utenti;
	}
	
	public void setUtente(Utente utente) {
		this.utenti.add(utente);
	}
	
	

}
