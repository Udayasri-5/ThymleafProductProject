package com.thymleaf.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thymleaf.product.entity.ProductCategory;
import com.thymleaf.product.repository.CategoryRepository;

@Service
public class CategoryServiceImplementation implements CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List<ProductCategory> findAll() {
		return repository.findAll();
	}

}
