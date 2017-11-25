package com.InheritanceMapping;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.DiscriminatorOptions;

@Entity
@Table(name = "bidder")
@PrimaryKeyJoinColumn(name = "userId")

public class Bidder extends Users {

	
@Column(name = "biderId")
private int bidderId;


public Bidder() {
	super();
}


public Bidder(int bidderId) {
	super();
	this.bidderId = bidderId;
}


public int getBidderId() {
	return bidderId;
}


public void setBidderId(int bidderId) {
	this.bidderId = bidderId;
}

}
