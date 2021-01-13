package com.cg.employeeExercise2.DAO;
import java.util.List;

import com.cg.employeeExercise2.domain.Employee;

/**
 * This EmployeeDAO Interface will perform Database(Local Repository)related Operation of Employee
 * @author Vasumanan J
 *
 */
public interface EmployeeDAO {
	/**
	 * This saveItem method will Save the Employee in the Local Repository
	 * @param employee it is the Object of Employee which is to stored in the Local Repository
	 */
	public void saveEmployee(Employee employee);
	
	/**
	 * This getList method will return the Employee List stored in the Local Repository
	 */
	public List<Employee>getList();
}
