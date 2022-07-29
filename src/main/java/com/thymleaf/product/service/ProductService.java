package com.thymleaf.product.service;

import java.util.List;

import com.thymleaf.product.entity.Product;
import com.thymleaf.product.entity.ProductCategory;

public interface ProductService {
	public List<Product> findAll();
	

	public Product findById(Integer id);

	public void deleteById(Integer id);

	public void save(Product product);
	
	public List<Product> findByKeyword(String keyword);

}
