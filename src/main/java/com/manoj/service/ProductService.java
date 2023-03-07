package com.manoj.service;

import java.util.List;

import com.manoj.models.Product;

public interface ProductService {

	
	public Product createProduct(Product product);
	
	public Product updateProduct(Product product,int ProductId);
	
	public void deleteProduct(int productId);
	
	public Product getProduct(int productId);
	
	public List<Product> getAllProducts();
}
