package com.manoj.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.manoj.mapper.ProductRowMapper;
import com.manoj.models.Product;

@Repository
public class ProductDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public Product saveProduct(Product p) {
		
		String query="insert into product(productId ,productName,productPrice , productDesc, stock) values(?,?,?,?,?)";
		
		int update = jdbcTemplate.update(query, 
				                              p.getProductId(),
				                              p.getProductName(),
				                              p.getProductPrice(),
				                              p.getProductDesc(),
				                              p.isStock());
		
		System.out.println(update+" updated");
		
		return p;
		
	}
	
	
	public Product updateProduct(Product p,int productId) {
		
		String query="update product set productName=?,set productPrice=?, set productDesc=?,set stock=? where productId=?";
		
		int update = jdbcTemplate.update(query,
				 p.getProductName(),
                 p.getProductPrice(),
                 p.getProductDesc(),
                 p.isStock());
		
		System.out.println(update+"updated product");
		p.setProductId(productId);
		return p;
	}
	
	
	public void deleteProduct(int productId) {
		
		String query="delete from product where productId=?";
		
		int deleted = jdbcTemplate.update(query, productId);
		
		System.out.println(deleted +"deleted Id");
	}
	
	
	public Product getProduct(int productId) {
		
		String query="select * from product where productId=?";
		
		Product queryForObject = jdbcTemplate.queryForObject(query, new ProductRowMapper(),productId );
		System.out.println(queryForObject +"getId");
		
		return queryForObject;
		
	}
	
	public List<Product> getAllProducts(){
		
		
		String query="select * from product";
		
		List<Product> pr = jdbcTemplate.query(query, new ProductRowMapper());
		System.out.println(pr +"all product");
		return pr;
	}
	
}
