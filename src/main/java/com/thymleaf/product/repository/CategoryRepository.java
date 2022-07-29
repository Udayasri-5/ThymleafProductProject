package com.thymleaf.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thymleaf.product.entity.ProductCategory;

@Repository
public interface CategoryRepository extends JpaRepository<ProductCategory,Integer> {

}
