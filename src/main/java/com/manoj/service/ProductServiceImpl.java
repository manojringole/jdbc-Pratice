package com.manoj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manoj.dao.ProductDao;
import com.manoj.models.Product;

@Service
public class ProductServiceImpl implements ProductService {

    
	@Autowired
	private ProductDao dao;
	
	@Override
	public Product createProduct(Product product) {
		
		return dao.saveProduct(product);
	}

	@Override
	public Product updateProduct(Product product, int ProductId) {
	
		return dao.updateProduct(product, ProductId);
	}

	@Override
	public void deleteProduct(int ProductId) {
		
		dao.deleteProduct(ProductId);
		
	}

	@Override
	public Product getProduct(int productId) {
		
		return dao.getProduct(productId);
	}

	@Override
	public List<Product> getAllProducts() {
		
		return dao.getAllProducts();
	}

}
