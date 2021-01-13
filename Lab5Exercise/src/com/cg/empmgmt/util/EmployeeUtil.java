package com.cg.empmgmt.util;
import java.util.*;

import com.cg.empmgmt.domain.*;
import com.cg.empmgmt.services.*;
import com.cg.empmgmt.servicesImple.EmployeeServiceImple;
public class EmployeeUtil {
	Scanner sc = new Scanner(System.in);
	private String firstName,lastName;
	private double salary;
	private int age,choice;
	boolean invalidAccount = false;
	private EmployeeServices employeeService ;
	private Employee employee;
	private List<Employee>empList ;
	public EmployeeUtil() {
		employeeService = new EmployeeServiceImple(); 
	}
	public void start() {
		System.out.println("--------Employee Management-----------");
		String continueStatus;
		do {
			showOptions();
			System.out.println("Enter Your choice : ");
			choice = sc.nextInt();
			switch(choice) {
			 	case 0:
			 		System.exit(0);
				case 1:
					addEmployee();
					break;
				case 2:
					showDetails();
					break;
				default:
					System.out.println("Invalid Option");
					break;
			}
			System.out.println("Did you wish to continue(Yes|No)");
			continueStatus = sc.next();
		}while(continueStatus.equalsIgnoreCase("yes"));
		
	}
	private void showDetails() {
		empList = new ArrayList<Employee>();
		empList = employeeService.getList();
		for(Employee emp : empList) {
			System.out.println(emp);
		}
	}
	private void addEmployee() {
        
		System.out.println("Enter the First Name :");
		firstName = sc.next();
		System.out.println("Enter the Last Name :");
		lastName = sc.next();
		System.out.println("Enter the Age :");
		age = sc.nextInt();
		System.out.println("Enter the Salary :");
		salary = sc.nextDouble();
		employee = new Employee(firstName,lastName,salary,age);
		try {
			employeeService.create(employee);
		}
		catch(Exception e) {
			invalidAccount=true;
			System.out.println(e.getMessage());
		}
		if(invalidAccount) {
			System.out.println("Sorry! Employee is not added..Retry");
		}
		else {
			System.out.println("Success! Employee is added...");
		}
		
	}
	private void showOptions() {
		System.out.println("1.Add Employee");
		System.out.println("2.Display Employee List");
		System.out.println("0.Exit");
	}
}
