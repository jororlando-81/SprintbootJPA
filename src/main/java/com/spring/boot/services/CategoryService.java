package com.spring.boot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.entities.Category;
import com.spring.boot.repositories.CategoryRepository;

@Service
public class CategoryService {
		
	@Autowired
	private CategoryRepository userRepository;
	
	public List<Category> finAll () {
		return 	userRepository.findAll();
	}
  
	public Category findById ( Long id ) {
		Optional<Category> obj  = userRepository.findById(id);  
		return obj.get();
	}
}	
	

