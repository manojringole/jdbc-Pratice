package com.manoj;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class JdbcUsingDurgeshConeptOld1Application implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(JdbcUsingDurgeshConeptOld1Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		
	/*	System.out.println("Application start...");
		
		String query="select * from product";
		
		List<Map<String, Object>> list = jdbcTemplate.queryForList(query);
		
		list.forEach(row -> {
			
			System.out.print(row.get("productId") +"\t");
			System.out.print(row.get("productName")+"\t");
			System.out.print(row.get("productPrice")+"\t");
			System.out.print(row.get("productDesc")+"\t");
			System.out.print(row.get("stock")+"\t");
			System.out.println("-----------------------------------");

		});*/
		
	}

}
