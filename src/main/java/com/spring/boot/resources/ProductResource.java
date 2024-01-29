package com.spring.boot.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.entities.Product;
import com.spring.boot.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	@Autowired
	private ProductService userService;
	
	@GetMapping
	public ResponseEntity<  List <Product>  > findALL(){
		
		List <Product> listProducts = userService.finAll();
		
		return ResponseEntity.ok().body(listProducts);
		
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity< Product> findById( @PathVariable Long id ){
			
		Product obj  = userService.findById(id);
		
		return ResponseEntity.ok().body(obj);  
		
	}
}
	