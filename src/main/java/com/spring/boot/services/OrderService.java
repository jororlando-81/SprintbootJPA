package com.spring.boot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.entities.Order;
import com.spring.boot.repositories.OrderRepository;

@Service
public class OrderService {
		
	@Autowired
	private OrderRepository userRepository;
	
	public List<Order> finAll () {
		return 	userRepository.findAll();
	}
  
	public Order findById ( Long id ) {
		Optional<Order> obj  = userRepository.findById(id);  
		return obj.get();
	}
}	
	

