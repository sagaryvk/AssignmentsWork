package com.actionbazaar.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "creditcard")
public class CreditCard {
@Id
@Column(name = "creditcardID")
private double creditcardId;
@Column(name = "accountnumber")
private double accountNumber;
@Column(name = "nameoncard")
private String nameOnCard;
public CreditCard() {
	super();
}
public CreditCard(double creditcardId, double accountNumber, String nameOnCard) {
	super();
	this.creditcardId = creditcardId;
	this.accountNumber = accountNumber;
	this.nameOnCard = nameOnCard;
}
public double getCreditcardId() {
	return creditcardId;
}
public void setCreditcardId(double creditcardId) {
	this.creditcardId = creditcardId;
}
public double getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(double accountNumber) {
	this.accountNumber = accountNumber;
}
public String getNameOnCard() {
	return nameOnCard;
}
public void setNameOnCard(String nameOnCard) {
	this.nameOnCard = nameOnCard;
}



}
