package com.spring.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{
	
	
}
