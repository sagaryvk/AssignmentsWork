package com.actionbazaar.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
	@Id
	@Column(name = "addressID")
	private double addressId;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;
	@Column(name = "Street")
	private String street;
	@Column(name = "Zipcode")
	private String zipCode;
	public Address() {
		super();
	}
	public Address(double addressId, String city, String state, String street, String zipCode) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.state = state;
		this.street = street;
		this.zipCode = zipCode;
	}
	public double getAddressId() {
		return addressId;
	}
	public void setAddressId(double addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	
	
	
	

}
