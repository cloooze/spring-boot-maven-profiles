package com.example.demo.repository;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericEntityRepository<T extends Serializable> extends JpaRepository<T, Long> {
	
	Optional<T> findByNome(String nome);
	
}
