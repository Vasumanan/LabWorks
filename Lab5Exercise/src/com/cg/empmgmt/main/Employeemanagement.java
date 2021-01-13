package com.cg.empmgmt.main;
import com.cg.empmgmt.util.*;
public class Employeemanagement {
	
	/**
	* Create an Exception class named as “EmployeeException”(User defined Exception) in a package named as “com.cg.eis.exception”.
	* Throw an exception if salary of an employee is below than 3000. 
	* Validate the age of a person and display proper message by using user defined exception. 
	* Age of a person should be above 15.
	* Create and throw a user defined exception if firstName and lastName is blank.
	* Use Exception Handling mechanism to handle exception properly.
	* 
	* @author Vasumanan J
	*
	*/
	public static void main(String[] args) {
		EmployeeUtil empMgmnt = new EmployeeUtil();
		empMgmnt.start();
	}

}
