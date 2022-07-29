package com.thymleaf.product.service;

import java.util.List;

import com.thymleaf.product.entity.ProductCategory;

public interface CategoryService {
	public List<ProductCategory> findAll();

}
