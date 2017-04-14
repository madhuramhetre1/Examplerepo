package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ProductDao;
import com.model.Product;

@Service("productService")
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao productDao;
	
	@Override
	public List<Product> listProducts() {
		  return productDao.listProducts();
	}

	@Override
	public Product getProduct(int productId) {
		return productDao.getProduct(productId);
	}


}
