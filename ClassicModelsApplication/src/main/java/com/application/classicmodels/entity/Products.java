package com.application.classicmodels.entity;



import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Products {
@Id
@Column(name = "productCode")
private String productCode;
@Column(name = "productName")
private String productName;
@Column(name = "productLine")
private String productLine;
@Column(name = "productScale")
private String productScale;

@Column(name = "productVendor")
private String productVendor;

@Column(name = "productDescription")
private String productDescription;

@Column(name = "quantityInStock")
private int quantityInStock;

@Column(name = "buyPrice")
private double buyPrice;
@Column(name = "MSRP")
private double MSRP;
/*
@OneToMany(cascade=CascadeType.ALL,mappedBy = "prod")
//@JoinColumn(name="productCode")

private Set<OrderDetails> orderDetails;

@ManyToOne
@JoinColumn(name ="productLine")
private ProductLines prodLines;



public ProductLines getProdLines() {
	return prodLines;
}
public void setProdLines(ProductLines prodLines) {
	this.prodLines = prodLines;
}
public Set<OrderDetails> getOrderDetails() {
	return orderDetails;
}
public void setOrderDetails(Set<OrderDetails> orderDetails) {
	this.orderDetails = orderDetails;
}
*/

public Products() {
	super();
}
public Products(String productCode, String productName, String productLine, String productScale, String productVendor,
		String productDescription, int quantityInStock, long buyPrice, long mSRP) {
	super();
	this.productCode = productCode;
	this.productName = productName;
	this.productLine = productLine;
	this.productScale = productScale;
	this.productVendor = productVendor;
	this.productDescription = productDescription;
	this.quantityInStock = quantityInStock;
	this.buyPrice = buyPrice;
	MSRP = mSRP;
}
public String getProductCode() {
	return productCode;
}
public void setProductCode(String productCode) {
	this.productCode = productCode;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductLine() {
	return productLine;
}
public void setProductLine(String productLine) {
	this.productLine = productLine;
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
public double getBuyPrice() {
	return buyPrice;
}
public void setBuyPrice(long buyPrice) {
	this.buyPrice = buyPrice;
}
public double getMSRP() {
	return MSRP;
}
public void setMSRP(long mSRP) {
	MSRP = mSRP;
}


}
