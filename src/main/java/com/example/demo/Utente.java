package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Utente {
	
	@Id
	public Long id;
	
	public String nome;
	
	public String cognome;
	
	@ManyToOne
	@JoinColumn(name = "idGruppo")
	public Gruppo gruppo;
	
	public void setGruppo(Gruppo gruppo) {
		this.gruppo = gruppo;
		gruppo.setUtente(this);
	}

}
