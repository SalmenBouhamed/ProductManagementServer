package com.example.demo.service;

import com.example.demo.entity.Product;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProdcutMockServiceImpl implements IProductService{
	
	private List<Product> products;

	public ProdcutMockServiceImpl() {
		products = new ArrayList<Product>();
		
		products.add(new Product("Livre", 50, 20));
		products.add(new Product("Stylo", 500, 2.5f));
		products.add(new Product("Livre", 50, 2.01f));
	}	
	
	@Override
	public List<Product> getProducts() {
		return products;
	}

	@Override
	public void addProduct(Product product) {
		products.add(product);
	}

	@Override
	public void updateProduct(Product product) {
		products.remove(product);
		products.add(product);
	}

	@Override
	public void deleteProduct(Long id) {
		Product product = new Product();
		product.setId(id);
		products.remove(product);
	}

}
