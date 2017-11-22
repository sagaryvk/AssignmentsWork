package com.mtc.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
@Entity
@Table(name="product")
public class Product {
	@Id
	@Column(name ="ID")
	private int id;
	@Column(name ="PROD_NAME")
	private String name;
	
	@Column(name ="DESCRIPTION")
	private String description;
	@Column(name ="PRICE")
	private float price;
	public Product() {
		super();
	}
	public Product(int id, String name, String description, float price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
