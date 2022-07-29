package com.thymleaf.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.thymleaf.product.entity.Product;
import com.thymleaf.product.entity.ProductCategory;

@Repository
public interface ProductRepository extends JpaRepository<Product ,Integer> {
	
	@Query(value = "select * from product where productname like %:keyword%",nativeQuery=true)
	List<Product> findByKeyword(@Param("keyword")String keyword);
	

}
