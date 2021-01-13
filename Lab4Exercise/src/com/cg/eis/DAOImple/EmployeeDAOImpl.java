package com.cg.eis.DAOImple;
import java.util.*;
import com.cg.eis.DAO.EmployeeDAO;
import com.cg.eis.domain.Employee;
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
