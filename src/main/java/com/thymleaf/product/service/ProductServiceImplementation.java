package com.thymleaf.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thymleaf.product.entity.Product;


import com.thymleaf.product.repository.ProductRepository;

@Service
public class ProductServiceImplementation implements ProductService{

	@Autowired
	private ProductRepository repository;
	
	
	
	public List<Product> findAll() {
		return repository.findAll();
		
	}


	public Product findById(Integer id) {
		Optional<Product> p =  repository.findById(id) ;
		Product prod = null;
		
		if(p.isPresent())
			prod = p.get();
		
		return prod;

	}

	
	public void deleteById(Integer id) {
		repository.deleteById(id);
		
	}

	
	public void save(Product product) {
		repository.save(product);
		
	}


	@Override
	public List<Product> findByKeyword(String keyword) {
		
		return repository.findByKeyword(keyword);
	}


	
	

}
