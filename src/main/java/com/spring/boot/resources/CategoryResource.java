package com.spring.boot.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.entities.Category;
import com.spring.boot.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryService userService;
	
	@GetMapping
	public ResponseEntity<  List <Category>  > findALL(){
		
		List <Category> listCategorys = userService.finAll();
		
		return ResponseEntity.ok().body(listCategorys);
		
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity< Category> findById( @PathVariable Long id ){
			
		Category obj  = userService.findById(id);
		
		return ResponseEntity.ok().body(obj);  
		
	}
}
	