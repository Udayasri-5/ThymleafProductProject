package com.thymleaf.product.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCTCATEGORY")
public class ProductCategory {
	
	@Id
	@Column(name="categoryid")
	private Integer categoryID;
	
	@Column(name="categoryname")
	private String categoryName;
	
	public ProductCategory() {
		
	}
	
	public ProductCategory(Integer categoryID , String categoryName) {
		this.categoryID = categoryID;
		this.categoryName = categoryName;
		
	}

	protected Integer getCategoryID() {
		return categoryID;
	}

	protected void setCategoryID(Integer categoryID) {
		this.categoryID = categoryID;
	}

	protected String getCategoryName() {
		return categoryName;
	}

	protected void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
     
	@Override
	public String toString() {
		return "ProductCategory [categoryID=" + categoryID + ", categoryName=" + categoryName + "]";
	}
	
}