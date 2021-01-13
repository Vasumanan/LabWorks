package com.cg.employeeExercise2.Util;
import java.util.*;

import com.cg.employeeExercise2.domain.*;
import com.cg.employeeExercise2.serviceImpl.*;
import com.cg.employeeExercise2.services.*;
public class EmployeeUtil {
	private List<Employee>employeeList;
	EmployeeService employeeService;
	public EmployeeUtil() {
		employeeList = new ArrayList<>();
		employeeService= new EmployeeServiceImpl();
	}
	public void start() {
		Scanner sc = new Scanner (System.in);
		Employee employee;
		int choice,id;
		String name,designation,continueStatus;
		double salary;
		do {
			displayChoice();
			System.out.println("Enter the choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the Name : ");
				name = sc.next();
				System.out.println("Enter the ID : ");
				id = sc.nextInt();
				System.out.println("Enter the Designation : ");
				designation = sc.next();
				System.out.println("Enter the Salary : ");
				salary = sc.nextDouble();
				employee = new Employee(id,name,designation,salary);
				employeeService.findInsuranceScheme(employee);
				employeeService.addEmployee(employee);
				System.out.println("success!..Employee added...\n");
				break;
			case 2:
				employeeList = employeeService.getList();
				for(Employee emp : employeeList) {
					System.out.println(emp);
				}
				break;
			case 0:
				System.out.println("==================THANK YOU HAVE A NICE DAY==================");
				System.exit(0);
			default:
				System.out.println("Invalid Option");
				break;
			}
			System.out.println("Did you wish to continue(Yes|No)");
			continueStatus = sc.next();
		}while(continueStatus.equalsIgnoreCase("yes"));
		System.out.println("==================THANK YOU HAVE A NICE DAY==================");
	}

	private void displayChoice() {
		System.out.println("-------------------EMPLOYEE MANAGEMENT-------------------");
		System.out.println("1.Add Employee");
		System.out.println("2.Display details");
		System.out.println("0.Exit");		
	}
}
