package com.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Product;

@Repository("productDao")
public class ProductDaoImpl implements ProductDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> listProducts() {
       return (List<Product>) sessionFactory.getCurrentSession().createCriteria(Product.class).list();
	}

	@Override
	public Product getProduct(int productId) {
	   return (Product) sessionFactory.getCurrentSession().get(Product.class, productId);
	}

}
