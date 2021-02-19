package com.cg.ngo.beans;


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.PastOrPresent;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table(name="Donations")
public class Donation {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int donationId;
	@OneToOne(cascade = CascadeType.ALL)
	private Donor donor;
	@OneToOne(cascade = CascadeType.ALL)
	private DonationItem item;
	@OneToOne(cascade = CascadeType.ALL)
	private DonationBox donationBox;
	private double donationAmount;
	@JsonFormat(pattern = "dd/MM/yyyy")
	@PastOrPresent
	private Date donationDate;
	public int getDonationId() {
		return donationId;
	}
	public void setDonationId(int donationId) {
		this.donationId = donationId;
	}
	public Donor getDonor() {
		return donor;
	}
	public void setDonor(Donor donor) {
		this.donor = donor;
	}
	public DonationItem getItem() {
		return item;
	}
	public void setItem(DonationItem item) {
		this.item = item;
	}
	public double getDonationAmount() {
		return donationAmount;
	}
	public void setDonationAmount(double donationAmount) {
		this.donationAmount = donationAmount;
	}
	public Date getDonationDate() {
		return donationDate;
	}
	public void setDonationDate(Date donationDate) {
		this.donationDate = donationDate;
	}
	public DonationBox getDonationBox() {
		return donationBox;
	}
	public void setDonationBox(DonationBox donationBox) {
		this.donationBox = donationBox;
	}
	
}

