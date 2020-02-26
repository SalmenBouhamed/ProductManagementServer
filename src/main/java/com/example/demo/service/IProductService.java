package com.example.demo.service;
import java.util.List;

import com.example.demo.entity.Product;

public interface IProductService {
	List<Product> getProducts();
	
	void addProduct(Product product);
	
	void updateProduct(Product product);
	
	void deleteProduct(String ref);
}
