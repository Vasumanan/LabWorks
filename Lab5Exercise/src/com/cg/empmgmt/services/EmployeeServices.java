package com.cg.empmgmt.services;
import com.cg.empmgmt.domain.*;
import com.cg.empmgmt.exception.InvalidAgeException;
import com.cg.empmgmt.exception.InvalidFirstNameException;
import com.cg.empmgmt.exception.InvalidLastNameException;
import com.cg.empmgmt.exception.InvalidSalaryException;
import java.util.*;

/**
 * This EmployeeService Interface will perform all the Employee Related Opearations.
 * @author Vasumanan J
 *
 */
public interface EmployeeServices {
	
	/**
	 * This create method will add the Employee to the Local Repository.
	 * @param employee it is Object of the Employee Class which is to be stored in the Local Repository
	 * @throws InvalidAgeException will be thrown in case age is less than 15.
	 * @throws InvalidSalaryException will be thrown in case salary is less than 3000.
	 * @throws InvalidFirstNameException will be thrown in case FirstName is empty.
	 * @throws InvalidLastNameException will be thrown in case LastName is empty.
	 */
	public void create(Employee employee) throws InvalidAgeException, InvalidSalaryException, InvalidFirstNameException, InvalidLastNameException;
	
	/**
	 * This getList method will return the Employee List stored in the Local Repository.
	 */
	
	public List<Employee> getList();
}
