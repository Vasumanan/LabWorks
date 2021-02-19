package com.cg.ngo.beans;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class DonationBox {
	@Id
	private int registrationNumber;
	@NotBlank(message="Please enter your NGO name")
	private String ngoName;
	@Size(min=12,max=12,message = "Please enter valid account number")
	 @NotBlank(message="Please enter your account number")
	private String accountNumber;
	private double totalCollection;
	public String getNgoName() {
		return ngoName;
	}
	public void setNgoName(String ngoName) {
		this.ngoName = ngoName;
	}
	public int getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getTotalCollection() {
		return totalCollection;
	}
	public void setTotalCollection(double totalCollection) {
		this.totalCollection = totalCollection;
	}
}

