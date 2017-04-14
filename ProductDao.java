package com.dao;

import java.util.List;

import com.model.Product;

public interface ProductDao {
	 
  public List<Product> listProducts(); 
  
  public Product getProduct(int productId);
	 
}
