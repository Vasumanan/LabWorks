package com.cg.ngo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ngo.exceptions.DuplicateDonorException;
import com.cg.ngo.exceptions.NoSuchDonorException;
import com.cg.ngo.beans.Donation;
import com.cg.ngo.beans.DonationBox;
import com.cg.ngo.beans.DonationItem;
import com.cg.ngo.beans.DonationType;
import com.cg.ngo.beans.Donor;
import com.cg.ngo.repository.DonarBoxRepository;
import com.cg.ngo.repository.DonarRepository;
import com.cg.ngo.services.DonarService;

@RestController
@RequestMapping("/ngo")
public class DonarController {

	@Autowired
	DonarService service;

	@Autowired
	DonarRepository donarRepository;
	
	@Autowired
	DonarBoxRepository donarBoxRepository;

	
	
	@PostMapping("/register")
	public Donor createDonor(@RequestBody Donor donor) throws DuplicateDonorException {
		Donor donorInfo = service.registerDonor(donor);
		return donorInfo;
	}
	@GetMapping("/loginDonor/{username}/{password}")
	public Donor validateDonor(@PathVariable("username") String username, @PathVariable("password") String password) throws NoSuchDonorException {
		Donor donor = service.login(username, password);
		return donor;
	}
	@PostMapping("/add/donation")
	public Donation addDonation(@Valid @RequestBody Donation donation) {
		donation = service.donateToNGO(donation);
		return donation;
	}
	
}
