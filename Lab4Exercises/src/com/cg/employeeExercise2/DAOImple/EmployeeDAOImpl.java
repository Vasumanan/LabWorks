package com.cg.employeeExercise2.DAOImple;
import java.util.*;

import com.cg.employeeExercise2.DAO.EmployeeDAO;
import com.cg.employeeExercise2.domain.Employee;
public class EmployeeDAOImpl implements EmployeeDAO{
	private List<Employee>localRepository;
	public EmployeeDAOImpl() {
		localRepository = new ArrayList<>();
	}
	@Override
	public void saveEmployee(Employee employee) {
		localRepository.add(employee);
	}

	@Override
	public List<Employee> getList() {
		return localRepository;
	}

}
