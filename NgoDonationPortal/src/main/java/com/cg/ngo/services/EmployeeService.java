package com.cg.ngo.services;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.cg.ngo.beans.NeedyPeople;
import com.cg.ngo.exceptions.NoSuchEmployeeException;



public interface EmployeeService {
	//public String login(int id,String userName, String password)throws NoSuchEmployeeException;
	public String login(String userName, String password)throws NoSuchEmployeeException;
	
	public int removeNeedyPerson(int id);
	public NeedyPeople findNeedyPeopleById(int id);
	public List<NeedyPeople> findNeedyPeopleByName(String name);
	public List<NeedyPeople> findAllNeedyPeople();
	//public String helpNeedyPerson(DonationDistribution distribute);
}
