package com.spring.boot.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findALL(){
		
		User user = new User( 1L, "aa" , "aa@aa.com" , "12341234" , "123" );
		
		return ResponseEntity.ok().body(user);
	}
}
