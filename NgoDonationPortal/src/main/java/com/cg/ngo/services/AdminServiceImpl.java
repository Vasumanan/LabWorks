package com.cg.ngo.services;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.ngo.beans.DonationBox;
import com.cg.ngo.beans.DonationDistribution;
import com.cg.ngo.beans.DonationDistributionStatus;
import com.cg.ngo.beans.Employee;
import com.cg.ngo.exceptions.DistributionIdNotFoundException;
import com.cg.ngo.exceptions.DuplicateEmployeeException;
import com.cg.ngo.exceptions.NoSuchEmployeeException;
import com.cg.ngo.repository.DonationBoxRepository;
import com.cg.ngo.repository.DonationDistributionRepository;
import com.cg.ngo.repository.EmployeeRepository;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private DonationDistributionRepository donationDistributionRepository;
	@Autowired
	private DonationBoxRepository donationBoxRepository;
	
	@Override
	public Employee createEmployee(Employee employee){
		if(employeeRepository.existsByUserName(employee.getUserName().toUpperCase())) {
			throw new DuplicateEmployeeException("User Name :"+employee.getUserName()+" already exist.");			
		}
		employee.setUserName(employee.getUserName().toUpperCase());
		return employeeRepository.save(employee);
	}
	
	
	@Override
	public String deleteEmployeeByUserName(String userName) {
		Employee employee = employeeRepository.findByUserName(userName.toUpperCase());
		if(employee==null){
			throw new NoSuchEmployeeException("User Name :"+userName+" does not exist.");
		}
		employeeRepository.delete(employee);
		return userName+" deleted";
	}
	
	
	@Override
	public List<Employee> getAllEmployeeDetails() {
		List <Employee>employeeList = new ArrayList<>(employeeRepository.findAll());
		if(employeeList==null) {
			throw new NoSuchEmployeeException("No records found.");
		}
		return employeeList;
	}
	
	
	@Override
	public Employee updateEmployee(Employee employee) {
		if(employeeRepository.existsById(employee.getEmployeeId())) {
			return employeeRepository.save(employee);
		}
		throw new NoSuchEmployeeException("Employee ID :"+employee.getEmployeeId()+" does not exist.");
	}
	
	
	@Override
	public Employee getEmployeeDetailsById(long employeeId) {
		if(employeeRepository.existsById(employeeId)){
			return employeeRepository.findById(employeeId);
		}
		throw new NoSuchEmployeeException("Employee ID :"+employeeId+" does not exist.");
	}
	
	
	@Override
	public List<Employee> getEmployeeDetailsByName(String name) {
		List <Employee>employeeList = new ArrayList<>(employeeRepository.findAllByName(name));
		if(employeeList==null) {
			throw new NoSuchEmployeeException("No records found for "+name);
		}
		return employeeList;
	}

	
	@Override
	public String approveOrRejectDonation(DonationDistribution donationDistribution , String donationBoxName) {
		if((donationDistributionRepository.existsById(donationDistribution.getDistributionId())&&(donationBoxRepository.existsById(donationBoxName)))) {
			DonationBox donationBox = donationBoxRepository.getOne(donationBoxName);
			if((donationDistribution.getNeedyPersonFamilyIncome()<10000)&&(donationBox.getTotalCollection()>1000)) {
				donationBox.setTotalCollection(donationBox.getTotalCollection()-1000);
				donationDistribution.setStatus(DonationDistributionStatus.APPROVED);
			}
			else {
				donationDistribution.setStatus(DonationDistributionStatus.REJECTED);
			}
			donationDistribution.setApprovalOrRejectedDate(new Date());
			return "Donation Status updated";
		}
		throw new DistributionIdNotFoundException("Distribution Id :"+donationDistribution.getDistributionId()+" not found");
	}
}