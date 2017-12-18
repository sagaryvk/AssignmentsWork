package com.application.classicmodels.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orderdetails")
public class Orderdetails{


	@EmbeddedId
	private CompositeKeys orderId;
	/*@Column(name = "orderNumber")
	private int orderNumber;
	@EmbeddedId
	@Column(name = "productCode")
	private String productCode;*/
	
	@Column(name = "quantityOrdered")
	private int quantityOrdered;
	@Column(name = "priceEach")
	private double priceEach;
	@Column(name = "orderLineNumber")
	private int orderLineNumber;
	
	
	public CompositeKeys getOrderId() {
		return orderId;
	}

	public void setOrderId(CompositeKeys orderId) {
		this.orderId = orderId;
	}

	/*
	@ManyToOne
	@JoinColumn(name = "productCode")
	private Products prod;
	
	
	public Products getProd() {
		return prod;
	}

	public void setProd(Products prod) {
		this.prod = prod;
	}
*/
	public Orderdetails() {
		super();
	}

	public Orderdetails(int orderNumber, String productCode, int quantityOrdered, double priceEach,
			int orderLineNumber) {
		super();
		//this.orderNumber = orderNumber;
		//this.productCode = productCode;
		this.quantityOrdered = quantityOrdered;
		this.priceEach = priceEach;
		this.orderLineNumber = orderLineNumber;
	}

/*	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
*/
	
	
	public int getQuantityOrdered() {
		return quantityOrdered;
	}



	public void setQuantityOrdered(int quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}

	public double getPriceEach() {
		return priceEach;
	}

	public void setPriceEach(double priceEach) {
		this.priceEach = priceEach;
	}

	public int getOrderLineNumber() {
		return orderLineNumber;
	}

	public void setOrderLineNumber(int orderLineNumber) {
		this.orderLineNumber = orderLineNumber;
	}
	
}
