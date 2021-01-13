package com.cg.empmgmt.servicesImple;
import java.util.List;

import com.cg.empmgmt.DAO.*;
import com.cg.empmgmt.DAOImple.*;
import com.cg.empmgmt.domain.Employee;
import com.cg.empmgmt.exception.*;
import com.cg.empmgmt.services.*;
public class EmployeeServiceImple implements EmployeeServices{
	EmployeeDAO employeeDAO= new EmployeeDAOImple();
	@Override
	public void create(Employee employee) throws InvalidAgeException,InvalidSalaryException,InvalidFirstNameException,InvalidLastNameException{
		if(employee.getFirstname().length()==0) {
			throw new InvalidFirstNameException("The first name should be filled");
		}
		else if(employee.getLastName().length()==0) {
			throw new InvalidLastNameException("The Last name should be filled");
		}
		else if(employee.getAge()<15) {
			throw new InvalidAgeException("The age should be above 15Years");
		}
		else if(employee.getSalary()<3000) {
			throw new InvalidSalaryException("The Salary of Employee should be greater than 3000");		
		}
		else {			
			employeeDAO.saveEmployee(employee);
		}
	}
	@Override
	public List<Employee> getList() {
		// TODO Auto-generated method stub
		return employeeDAO.getList();
	}


}
