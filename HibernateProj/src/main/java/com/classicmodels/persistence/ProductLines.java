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

import com.actionbazaar.persistence.Bid;

@Entity
@Table(name = "productlines")
public class ProductLines implements Serializable {

	@Id
	@Column(name = "productLine")
	private String ProductLine;
	@Column(name = "textDescription")
	private String textDescription;
	@Column(name = "htmlDescription")
	private String htmlDescription;
	@Column(name = "image")
	private String image;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="productLine")
	private Set<Products> products;

	public Set<Products> getProducts() {
		return products;
	}
	public void setProducts(Set<Products> products) {
		this.products = products;
	}
	public ProductLines() {
		super();
	}
	public ProductLines(String productLine, String textDescription, String htmlDescription, String image) {
		super();
		this.ProductLine = productLine;
		this.textDescription = textDescription;
		this.htmlDescription = htmlDescription;
		this.image = image;
	}
	public String getProductLine() {
		return ProductLine;
	}
	public void setProductLine(String productLine) {
		ProductLine = productLine;
	}
	public String getTextDescription() {
		return textDescription;
	}
	public void setTextDescription(String textDescription) {
		this.textDescription = textDescription;
	}
	public String getHtmlDescription() {
		return htmlDescription;
	}
	public void setHtmlDescription(String htmlDescription) {
		this.htmlDescription = htmlDescription;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
		
	
}
