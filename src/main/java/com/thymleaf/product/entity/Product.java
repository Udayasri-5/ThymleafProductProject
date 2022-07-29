package com.thymleaf.product.entity;

import java.util.Date;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT")
public class Product {
	
	@Id
	@Column(name="Productid")
	public Integer productID;
	
	@Column(name="sku")
	private String SKU;
	
	@Column(name="productname")
	private String productName;
	
	@Column(name="productdescription")
	private String productDescription;
	
	@Column(name="unitprice")
	private double unitPrice;
	
	@Column(name="imageurl")
	private String imageURL;
	
	@Column(name="activebit")
     private int activeBit;	
	
	@Column(name="unitinstock")
	private int unitsInStock;
	
	@Column(name="datecreated")
	private Date dateCreated;
	
	@Column(name="lastupdated")
	private Date lastUpdated;
	
	@Column(name="categoryid")
	private Integer categoryID;
	
	public Product() {
		
	}
	
	public Product(Integer productID,String SKU,String productName,String productDescription,double unitPrice,String imageURL,int activeBit
			,int unitsInStock,Date dateCreated ,Date lastUpdated ,Integer categoryID) {
		this.productID = productID;
		this.SKU = SKU;
		this.productName = productName;
		this.productDescription = productDescription;
		this.unitPrice = unitPrice;
		this.imageURL = imageURL;
		this.activeBit = activeBit;
		this.unitsInStock = unitsInStock;
		this.dateCreated = dateCreated;
		this.lastUpdated = lastUpdated;
		this.categoryID = categoryID;
	
	}

	

	public Integer getProductID() {
		return productID;
	}

	protected void setProductID(Integer productID) {
		this.productID = productID;
	}

	protected String getSKU() {
		return SKU;
	}

	protected void setSKU(String sKU) {
		SKU = sKU;
	}

	protected String getProductName() {
		return productName;
	}

	protected void setProductName(String productName) {
		this.productName = productName;
	}

	protected String getProductDescription() {
		return productDescription;
	}

	protected void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	protected double getUnitPrice() {
		return unitPrice;
	}

	protected int getActiveBit() {
		return activeBit;
	}



	protected void setActiveBit(int activeBit) {
		this.activeBit = activeBit;
	}



	protected void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	protected String getImageURL() {
		return imageURL;
	}

	protected void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	protected int getUnitsInStock() {
		return unitsInStock;
	}

	protected void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	protected Date getDateCreated() {
		return dateCreated;
	}

	protected void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	protected Date getLastUpdated() {
		return lastUpdated;
	}

	protected void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	protected Integer getCategoryID() {
		return categoryID;
	}

	protected void setCategoryID(Integer categoryID) {
		this.categoryID = categoryID;
	}
	
	
	@Override
	public String toString() {
		return "Product [productID=" + productID + ", SKU=" + SKU + ", productName=" + productName
				+ ", productDescription=" + productDescription + ", unitPrice=" + unitPrice + ", imageURL=" + imageURL
				+ ",ActiveBit=" + activeBit + ", unitsInStock=" + unitsInStock + ", dateCreated=" + dateCreated + ", lastUpdated=" + lastUpdated
				+ ", categoryID=" + categoryID + "]";
	}
	
	

}
