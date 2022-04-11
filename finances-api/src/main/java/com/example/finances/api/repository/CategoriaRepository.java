package com.example.finances.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.finances.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{	
	
}
