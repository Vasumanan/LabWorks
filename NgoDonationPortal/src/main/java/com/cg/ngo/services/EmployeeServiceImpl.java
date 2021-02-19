package com.cg.ngo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ngo.beans.Employee;
import com.cg.ngo.beans.NeedyPeople;
import com.cg.ngo.exceptions.NoSuchEmployeeException;
import com.cg.ngo.exceptions.NoSuchNeedyPersonException;
import com.cg.ngo.repository.EmployeeRepository;
import com.cg.ngo.repository.NeedyPeopleRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
    private EmployeeRepository employeeRepository;
	
	@Autowired
    private NeedyPeopleRepository needyPeopleRepository;
	@Override
	public String login(String userName, String password) throws NoSuchEmployeeException {
		Employee employee = employeeRepository.employeeLogin(userName, password);
		if(employee == null) {
			throw new NoSuchEmployeeException("No Employee Found");
		}
		else
		{
			    String userName1 = employee.getUserName();
				String password2 = employee.getPassword();
				if (userName.equals(userName1) && password.equals(password2))
				{
					return "LOGIN SUCCESSFUL!!";
		        }
	     }
		return "Invalid Credentials";
	}

	@Override
	public int removeNeedyPerson(int id) {
		Optional<NeedyPeople> needyPeople=needyPeopleRepository.findById(id);
		if(needyPeople==null)
		{
			throw new NoSuchNeedyPersonException("No Needy Person found with this id");
		}
		else
		{
			needyPeopleRepository.delete(needyPeople.get());
	   	    return id;	
		}
   	    
	}

	@Override
	public NeedyPeople findNeedyPeopleById(int id) {
		Optional<NeedyPeople> needyPeople=needyPeopleRepository.findById(id);
		return needyPeople.get();
	}

	@Override
	public List<NeedyPeople> findNeedyPeopleByName(String needyPersonName) {
			List<NeedyPeople> needyPeopleList=needyPeopleRepository.findNeedyPeopleByName(needyPersonName);
			return needyPeopleList;
	}

	@Override
	public List<NeedyPeople> findAllNeedyPeople() {
		List<NeedyPeople> needyPeopleList=(List<NeedyPeople>) needyPeopleRepository.findAll();
		return needyPeopleList;
	}
}

	