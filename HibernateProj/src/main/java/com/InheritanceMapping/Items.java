package com.InheritanceMapping;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "items")
public class Items implements Serializable {

	@Id
	@Column(name = "item_id")
	private Long itemId;
	@Column(name = "item_name")
	private String itemName;

	@OneToMany
	@JoinColumn(name="item_id")
	private Seller seller;

	
}
