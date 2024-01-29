package com.spring.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	

	
	
}
