package com.cg.ngo.beans;

import javax.persistence.*;
@Entity
@Table(name="Employees")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long employeeId;
	private String employeeName;
	private String email;
	private String phone;
	private String userName;
	private String password;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	public Employee() {
		
	}
	public Employee(String employeeName, String email, String phone, String userName, String password,
			Address address) {
		super();
		this.employeeName = employeeName;
		this.email = email;
		this.phone = phone;
		this.userName = userName;
		this.password = password;
		this.address = address;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	

}
