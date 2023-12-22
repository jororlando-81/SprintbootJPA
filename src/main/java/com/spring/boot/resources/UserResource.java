package com.spring.boot.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.entities.User;
import com.spring.boot.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public ResponseEntity<  List <User>  > findALL(){
		
		List <User> listUsers = userService.finAll();
		
		return ResponseEntity.ok().body(listUsers);
		
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity< User> findById( @PathVariable Long id ){
			
		User obj  = userService.findById(id);
		
		return ResponseEntity.ok().body(obj);  
		
	}
}
	