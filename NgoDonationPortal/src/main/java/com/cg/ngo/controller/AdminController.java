package com.cg.ngo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ngo.beans.DonationDistribution;
import com.cg.ngo.beans.Employee;
import com.cg.ngo.services.AdminService;
import com.cg.ngo.services.AdminServiceImpl;

@RestController
public class AdminController {

	@Autowired
	private AdminServiceImpl adminServiceImpl;

	
	@PostMapping("/saveEmployee")
	public ResponseEntity<?>  saveEmployee(@RequestBody Employee employee) {
		return new ResponseEntity<Employee>(adminServiceImpl.createEmployee(employee), HttpStatus.CREATED);
	}
	
	@GetMapping("/findEmployee/{employeeId}")
	public ResponseEntity<?> findEmployeeById(@PathVariable long employeeId){
		return new ResponseEntity<Employee>(adminServiceImpl.getEmployeeDetailsById(employeeId),HttpStatus.FOUND);
	}
	
	@GetMapping("/findAllEmployee")
	public ResponseEntity<?> findAllEmployee(){
		return new ResponseEntity<List>(adminServiceImpl.getAllEmployeeDetails(),HttpStatus.FOUND);
	}
    
	@DeleteMapping("/deleteEmployee/{userName}")
	public ResponseEntity<?>  deleteEmployee(@PathVariable String userName) {
		return new ResponseEntity<String>(adminServiceImpl.deleteEmployeeByUserName(userName),HttpStatus.OK);
	}
    
	@GetMapping("/findAllEmployeesByName/{employeeName}")
	public ResponseEntity<?>  findAllEmployeesByName(@PathVariable String employeeName){
		return new ResponseEntity<List>(adminServiceImpl.getEmployeeDetailsByName(employeeName),HttpStatus.FOUND);
	}

    @PutMapping("/UpdateEmployee")
	public  ResponseEntity<?>  updateEmployee(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(adminServiceImpl.updateEmployee(employee),HttpStatus.OK);
	}
    
    @GetMapping("/approveOrRejectDonation/{donationBoxName}")
	public ResponseEntity<?> findEmployeeByUserName(@RequestBody DonationDistribution donation,@PathVariable String donationBoxName){	
		return new ResponseEntity<String>(adminServiceImpl.approveOrRejectDonation(donation, donationBoxName),HttpStatus.FOUND);
	}
}
