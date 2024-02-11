package com.mydata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mydata.Repository.ProductRepository;
import com.mydata.model.Product;

@Service
public class ProductServiceimpl implements ProductService {
	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Product> viewallProduct() {
		return productRepository.findAll() ;
	}

	@Override
	public Product saveproduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public void deleteproductbyid(int id) {
		productRepository.deleteById(id);
	}

	@Override
	public Product updateproduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product getproductbyid(int id) {
		return productRepository.findById(id).get();
	}

}
