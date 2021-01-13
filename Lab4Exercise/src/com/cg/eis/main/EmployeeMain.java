package com.cg.eis.main;
import com.cg.eis.Util.EmployeeUtil;
/**
*create packages and classes as given belelow
*In this package, create “Employee” class with different attributes such as id, name, salary, designation, insuranceScheme.
*b)	com.cg.eis.service
*This package will contain code for services offered in Employee Insurance System. The service class will have one EmployeeService Interface and its corresponding implementation class.
*The services offered by this class are:
*i)	Get employee details from user.
*ii)Find the insurance scheme for an employee based on salary and designation.
*iii)Display all the details of an employee.
*c)	com.cg.eis.pl
*This package will contain code for getting input from user, produce expected output to the user and invoke services offered by the system. 
* @author Vasumanan J
*
*/

public class EmployeeMain {
	public static void main (String args[]) {
		EmployeeUtil employee = new EmployeeUtil();
	    employee.start();
	}
	
}
