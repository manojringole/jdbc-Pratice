package com.manoj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manoj.models.Product;
import com.manoj.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService service;
	
	
	@PostMapping("/")
	public ResponseEntity<Product> createProduct(@RequestBody Product product){
		
		Product save = service.createProduct(product);
		return new ResponseEntity<Product>(save, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/{productId}")
	public ResponseEntity<Product> getProduct(@PathVariable int productId){
		
		Product product = service.getProduct(productId);
		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Product>> getAllProduct(){
		
		List<Product> allProducts = service.getAllProducts();
		return new ResponseEntity<List<Product>>(allProducts, HttpStatus.OK);
		
	}
	
	@PutMapping("/{productId}")
	public ResponseEntity<Product> updateProduct(@RequestBody Product product, @PathVariable int productId){
		
		Product update = service.updateProduct(product, productId);
		return new ResponseEntity<Product>(update , HttpStatus.OK);
	}
	
	@DeleteMapping("/{productId}")
	public ResponseEntity<String> deleteProduct(@PathVariable int productId){
		
		
		service.deleteProduct(productId);
		String s="deleted successfully";
		return new ResponseEntity<String>(s,HttpStatus.OK);
	}
	
}
