package com.actionbazaar.persistence;

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
public class Item implements Serializable {

	@Id
	@Column(name = "item_id")
	private Long itemId;
	@Column(name = "item_name")
	private String itemName;

	@Column(name = "created_date")
	@Temporal(TemporalType.DATE)
	private Date createdDate;

	@Column(name = "initial_price")
	private BigDecimal initialPrice;

	@Column(name = "bid_start_date")
	@Temporal(TemporalType.DATE)
	private Date bidStartDate;

	@Column(name = "bid_end_date")
	@Temporal(TemporalType.DATE)
	private Date bidEndDate;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="item_id")
	private Set<Bid> bids;

	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(Long itemId, String itemName, Date createdDate, BigDecimal initialPrice, Date bidStartDate,
			Date bidEndDate) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.createdDate = createdDate;
		this.initialPrice = initialPrice;
		this.bidStartDate = bidStartDate;
		this.bidEndDate = bidEndDate;
	}

	public Set<Bid> getBids() {
		return bids;
	}

	public void setBids(Set<Bid> bids) {
		this.bids = bids;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public BigDecimal getInitialPrice() {
		return initialPrice;
	}

	public void setInitialPrice(BigDecimal initialPrice) {
		this.initialPrice = initialPrice;
	}

	public Date getBidStartDate() {
		return bidStartDate;
	}

	public void setBidStartDate(Date bidStartDate) {
		this.bidStartDate = bidStartDate;
	}

	public Date getBidEndDate() {
		return bidEndDate;
	}

	public void setBidEndDate(Date bidEndDate) {
		this.bidEndDate = bidEndDate;
	}

}
