package com.mydata.service;

import java.util.List;

import com.mydata.model.Product;

public interface ProductService {

	List<Product> viewallProduct();
	
	Product saveproduct(Product product);
	
	void deleteproductbyid(int id);
	
	 Product updateproduct(Product product);
	 
	 Product getproductbyid(int id);
	
}
