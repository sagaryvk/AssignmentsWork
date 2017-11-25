package com.classicmodels.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orderdetails")
public class OrderDetails implements Serializable {
	@Id
	@Column(name = "orderNumber")
	private int orderNumber;
	@Column(name = "quantityOrdered")
	private int quantityOrdered;
	@Column(name = "priceEach")
	private double priceEach;
	@Column(name = "orderLineNumber")
	private int orderLineNumber;
	
	@ManyToOne
	@JoinColumn(name = "productCode")
	private Products prod;
	
	
	public Products getProd() {
		return prod;
	}

	public void setProd(Products prod) {
		this.prod = prod;
	}

	public OrderDetails() {
		super();
	}

	public OrderDetails(int orderNumber, int quantityOrdered, double priceEach, int orderLineNumber) {
		super();
		this.orderNumber = orderNumber;
		this.quantityOrdered = quantityOrdered;
		this.priceEach = priceEach;
		this.orderLineNumber = orderLineNumber;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

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
