package com.cg.eis.domain;

public class Employee {
	private int id;
	private String name,designation,insuranceScheme;
	private double salary;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDesignation() {
		return designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public double getSalary() {
		return salary;
	}
	public Employee(int id, String name, String designation,double salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", insuranceScheme="
				+ insuranceScheme + ", salary=" + salary + "]";
	}
	
}
