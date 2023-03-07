package com.manoj.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.manoj.models.Product;

public class ProductRowMapper implements RowMapper<Product> {

	
	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Product p=new Product();
		
		p.setProductId(rs.getInt("productId"));
		p.setProductName(rs.getString("productName"));
		p.setProductPrice(rs.getInt("productPrice"));
		p.setProductDesc(rs.getString("productDesc"));
		p.setStock(rs.getBoolean("stock"));
		
		return p;
	}

}
