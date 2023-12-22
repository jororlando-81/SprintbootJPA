package com.spring.boot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.entities.User;
import com.spring.boot.repositories.UserRepository;

@Service
public class UserService {
		
	@Autowired
	private UserRepository userRepository;
	
	public List<User> finAll () {
		return 	userRepository.findAll();
	}
  
	public User findById ( Long id ) {
		Optional<User> obj  = userRepository.findById(id);  
		return obj.get();
	}
}	
	

