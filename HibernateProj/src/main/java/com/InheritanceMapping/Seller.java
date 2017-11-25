package com.InheritanceMapping;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.DiscriminatorOptions;

@Entity
@Table(name = "seller")
@PrimaryKeyJoinColumn(name = "userId")

public class Seller extends Users {
@Column(name = "commission_rate")
private float commisionRate;
@Column(name = "max_items")
private int maxItems;
public Seller() {
	super();
}
public Seller(float commisionRate, int maxItems) {
	super();
	this.commisionRate = commisionRate;
	this.maxItems = maxItems;
}
public float getCommisionRate() {
	return commisionRate;
}
public void setCommisionRate(float commisionRate) {
	this.commisionRate = commisionRate;
}
public int getMaxItems() {
	return maxItems;
}
public void setMaxItems(int maxItems) {
	this.maxItems = maxItems;
}

}
