package com.service;

import java.util.List;

import com.model.Product;

public interface ProductService {

	 public List<Product> listProducts();
	 
	 public Product getProduct(int productId);
}
