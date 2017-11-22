package com.classicmodels.persistence;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Products implements Serializable {
@Id
@Column(name = "productCode")
private String ProductCode;
@Column(name = "productName")
private String productName;
@Column(name = "productScale")
private String productScale;

@Column(name = "productVendor")
private String productVendor;

@Column(name = "productDescription")
private String productDescription;

@Column(name = "quantityInStock")
private int quantityInStock;

@Column(name = "buyPrice")
private long buyPrice;
@Column(name = "MSRP")
private long MSRP;
@OneToMany(cascade=CascadeType.ALL)
@JoinColumn(name="productCode")
private Set<OrderDetails> orderDetails;


public Set<OrderDetails> getOrderDetails() {
	return orderDetails;
}
public void setOrderDetails(Set<OrderDetails> orderDetails) {
	this.orderDetails = orderDetails;
}

public Products() {
	super();
}

public Products(String productCode, String productName, String productScale, String productVendor,
		String productDescription, int quantityInStock, long buyPrice, long mSRP) {
	super();
	ProductCode = productCode;
	this.productName = productName;
	this.productScale = productScale;
	this.productVendor = productVendor;
	this.productDescription = productDescription;
	this.quantityInStock = quantityInStock;
	this.buyPrice = buyPrice;
	MSRP = mSRP;
	
}
public String getProductCode() {
	return ProductCode;
}
public void setProductCode(String productCode) {
	ProductCode = productCode;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductScale() {
	return productScale;
}
public void setProductScale(String productScale) {
	this.productScale = productScale;
}
public String getProductVendor() {
	return productVendor;
}
public void setProductVendor(String productVendor) {
	this.productVendor = productVendor;
}
public String getProductDescription() {
	return productDescription;
}
public void setProductDescription(String productDescription) {
	this.productDescription = productDescription;
}
public int getQuantityInStock() {
	return quantityInStock;
}
public void setQuantityInStock(int quantityInStock) {
	this.quantityInStock = quantityInStock;
}
public long getBuyPrice() {
	return buyPrice;
}
public void setBuyPrice(long buyPrice) {
	this.buyPrice = buyPrice;
}
public long getMSRP() {
	return MSRP;
}
public void setMSRP(long mSRP) {
	MSRP = mSRP;
}

	
}
