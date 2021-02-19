package com.cg.ngo.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
@Entity
public class Address {

	@Id
	@GeneratedValue
	private int addressId;
	@NotBlank(message = "City Required.")
	private String city;
	@NotBlank(message = "State Required.")
	private String state;
	@NotBlank(message = "Pincode Required.")
	@Size(min = 6, message = "Enter Valid PinCode")
	private String pin;
	@NotBlank(message = "LandMark Required.")
	private String landmark;
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

}
