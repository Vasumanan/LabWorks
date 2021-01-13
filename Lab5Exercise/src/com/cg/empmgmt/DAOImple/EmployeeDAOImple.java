package com.cg.empmgmt.DAOImple;
import java.util.*;

import com.cg.empmgmt.DAO.*;
import com.cg.empmgmt.domain.*;
public class EmployeeDAOImple implements EmployeeDAO{
	private List<Employee> localRepository;
	public EmployeeDAOImple() {
		localRepository= new ArrayList<>();
	}
	@Override
	public void saveEmployee(Employee employee) {
		localRepository.add(employee);
	}
	public List<Employee>getList(){
		return localRepository;
	}

}
