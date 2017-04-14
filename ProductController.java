package com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Product;
import com.service.ProductService;
import com.service.ProductServiceImpl;

@Controller
public class ProductController {

	 @Autowired
	 private ProductService productService;
	 
	 @RequestMapping(value="/products.html", method = RequestMethod.GET)
	 public ModelAndView listProducts() {
	  System.out.println("in contr li");
	  Map<String, Object> model = new HashMap<String, Object>();
	  model.put("products",prepareListofProduct());
	  return new ModelAndView("productsList", model);
	 }
	 
	 
	 private List<Product> prepareListofProduct(){
		 System.out.println("in contr pr");
		 List<Product> productlist= new ArrayList<Product>();
		 for (Product product : productService.listProducts()){
			 Product p1=new Product();
			 p1.setProductId(product.getProductId());
			 p1.setProductName(product.getProductName());
			 p1.setQuantity(product.getQuantity());
			 p1.setPrice(product.getPrice());
			 productlist.add(p1);
		 }
		 return productlist;
	 }

}
