package com.cg.ngo.beans;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class DonationDistribution {
	@Id
	private long distributionId;
	private String needyPersonUserName;
	public String getNeedyPersonUserName() {
		return needyPersonUserName;
	}
	public void setNeedyPersonUserName(String needyPersonUserName) {
		this.needyPersonUserName = needyPersonUserName;
	}
	@ManyToOne(cascade = CascadeType.ALL)
	private DonationItem item;
	public double getNeedyPersonFamilyIncome() {
		return needyPersonFamilyIncome;
	}
	public void setNeedyPersonFamilyIncome(double needyPersonFamilyIncome) {
		this.needyPersonFamilyIncome = needyPersonFamilyIncome;
	}
	private double needyPersonFamilyIncome;
	private double amountDistributed;
	private Date dateOfDistribution;
	private Date approvalOrRejectedDate;
	 @Enumerated(EnumType.STRING)
	private DonationDistributionStatus status;
	public long getDistributionId() 
	{
		return distributionId;
	}
	public void setDistributionId(long distributionId) {
		this.distributionId = distributionId;
	}
	
	public DonationItem getItem() {
		return item;
	}
	public void setItem(DonationItem item) {
		this.item = item;
	}
	
	public double getAmountDistributed() {
		return amountDistributed;
	}
	public void setAmountDistributed(double amountDistributed) {
		this.amountDistributed = amountDistributed;
	}
	public Date getDateOfDistribution() {
		return dateOfDistribution;
	}
	public void setDateOfDistribution(Date dateOfDistribution) {
		this.dateOfDistribution = dateOfDistribution;
	}
	public Date getApprovalOrRejectedDate() {
		return approvalOrRejectedDate;
	}
	public void setApprovalOrRejectedDate(Date approvalOrRejectedDate) {
		this.approvalOrRejectedDate = approvalOrRejectedDate;
	}
	public DonationDistributionStatus getStatus() {
		return status;
	}
	public void setStatus(DonationDistributionStatus status) {
		this.status = status;
	}
	
	
}
