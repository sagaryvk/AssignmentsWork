package com.actionbazaar.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "billing")
public class Billing {
	@Id
	@Column(name = "billingID")
	private int billingId;
	@OneToOne
    @JoinColumn(name = "addressID")
	private Address bllingAddress;
	@OneToOne
	@JoinColumn(name = "creditcardID")
	private CreditCard creditcardId;
	public Billing() {
		super();
	}
	public Billing(int billingId, Address bllingAddress, CreditCard creditcardId) {
		super();
		this.billingId = billingId;
		this.bllingAddress = bllingAddress;
		this.creditcardId = creditcardId;
	}
	public int getBillingId() {
		return billingId;
	}
	public void setBillingId(int billingId) {
		this.billingId = billingId;
	}
	public Address getBllingAddress() {
		return bllingAddress;
	}
	public void setBllingAddress(Address bllingAddress) {
		this.bllingAddress = bllingAddress;
	}
	public CreditCard getCreditcardId() {
		return creditcardId;
	}
	public void setCreditcardId(CreditCard creditcardId) {
		this.creditcardId = creditcardId;
	}
	
	
}
