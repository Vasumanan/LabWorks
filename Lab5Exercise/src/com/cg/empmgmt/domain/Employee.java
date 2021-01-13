package com.cg.empmgmt.domain;
import java.util.*;

import com.cg.empmgmt.exception.*;
public class Employee {
	private String firstname,lastName;
	private double salary;
	private int age;
	public Employee(String firstname, String lastName, double salary, int age) {
		super();
		this.firstname = firstname;
		this.lastName = lastName;
		this.salary = salary;
		this.age = age;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public double getSalary() {
		return salary;
	}
	public int getAge() {
		return age;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setAge(int age) throws InvalidAgeException{
		this.age = age;
	}
	@Override
	public String toString() {
		return "Name : "+getFirstname()+" "+getLastName()+"    Age : "+getAge()+"   Salary : "+getSalary();
		
	}
}
