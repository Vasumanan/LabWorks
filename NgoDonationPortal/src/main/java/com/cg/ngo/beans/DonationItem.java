package com.cg.ngo.beans;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="DonationItems")
public class DonationItem {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int itemId;
	@Enumerated(EnumType.STRING)
	private DonationType item;
	private String itemDescription;
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public DonationType getItem() {
		return item;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public void setItem(DonationType item) {
		this.item = item;
	}
}
