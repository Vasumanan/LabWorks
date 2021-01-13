package com.cg.eis.serviceImpl;

import java.util.List;
import com.cg.eis.DAO.*;
import com.cg.eis.DAOImple.EmployeeDAOImpl;
import com.cg.eis.domain.Employee;
import com.cg.eis.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDAO employeeDAO ;
	public EmployeeServiceImpl() {
		employeeDAO = new EmployeeDAOImpl();
	}
	@Override
	public List<Employee> getList() {
		return employeeDAO.getList();
	}

	@Override
	public void addEmployee(Employee employee) {
		employeeDAO.saveEmployee(employee);		
	}

	@Override
	public void findInsuranceScheme(Employee employee) {
		if(employee.getSalary()<20000) {
			employee.setInsuranceScheme("Golden");
		}
		else if(employee.getSalary()>20000  && employee.getSalary()<50000) {
			employee.setInsuranceScheme("Diamond");
		}
		else {
			employee.setInsuranceScheme("Platinum");
		}
	}

}
