package com.cg.eis.service;
import java.util.*;
import com.cg.eis.domain.*;
/**
 * This EmployeeService Interface will perform all the Employee Related Opearations.
 * @author Vasumanan J
 *
 */

public interface EmployeeService  {
	/**
	 * This getList method will return the Employee List stored in the Local Repository.
	 */
	public List<Employee>getList();
	
	/**
	 * This addEmployee method will add the Employee to the Local Repository.
	 * @param employee it is Object of the Employee Class which is to be stored in the Local Repository
	 */
	public void addEmployee(Employee employee);
	
	/**
	 * This findInsuranceScheme method will find the insurance scheme to the employee based on the salary.
	 * @param employee object to which we need find insurance scheme
	 */
	public void findInsuranceScheme(Employee employee);
	
}
