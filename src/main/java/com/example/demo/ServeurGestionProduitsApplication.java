package com.example.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;

@SpringBootApplication
public class ServeurGestionProduitsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(ServeurGestionProduitsApplication.class, args);
	/*	ProductRepository productRepository = ctx.getBean(ProductRepository.class);
		
		productRepository.save(new Product("Livre", 50, 20));
		productRepository.save(new Product("Stylo", 500, 2.5f));
		productRepository.save(new Product("Livre", 50, 2.01f));*/
	}

}
