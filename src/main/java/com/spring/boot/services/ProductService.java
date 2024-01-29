package com.spring.boot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.entities.Product;
import com.spring.boot.repositories.ProductRepository;

@Service
public class ProductService {
		
	@Autowired
	private ProductRepository userRepository;
	
	public List<Product> finAll () {
		return 	userRepository.findAll();
	}
  
	public Product findById ( Long id ) {
		Optional<Product> obj  = userRepository.findById(id);  
		return obj.get();
	}
}	
	

