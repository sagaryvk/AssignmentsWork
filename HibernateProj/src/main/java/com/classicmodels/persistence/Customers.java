package com.classicmodels.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "customers")
public class Customers implements Serializable{
	@Id
	@Column(name = "customerNumber")
	private int customerNumber;
	@Column(name = "customerName")
	private String customerName;
	@Column(name = "contactLastName")
	private String contactLastName;
	@Column(name = "contactFirstName")
	private String contactFirstName;
	@Column(name = "phone")
	private String phone;
	@Column(name = "addressLine1")
	private String addressLine1;
	@Column(name = "addressLine2")
	private String addressLine2;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;
	@Column(name = "postalCode")
	private String postalCode;
	@Column(name = "country")
	private String country;
	@Column(name = "salesRepEmployeeNumber")
	private String salesRepEmployeeNumber;
	@Column(name = "creditLimit")
	private String creditLimit;
	
}
