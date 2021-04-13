package com.example.demo.model;

import java.time.LocalDate;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Product {
	
	@Id
	public Long id;
	
	public LocalDate dateIns;
	
	public Long quantity;
	

}
