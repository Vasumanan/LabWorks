package com.cg.ngo.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ngo.exceptions.DuplicateDonorException;
import com.cg.ngo.exceptions.NoSuchDonorException;
import com.cg.ngo.beans.Donation;
import com.cg.ngo.beans.Donor;
import com.cg.ngo.repository.DonarRepository;
import com.cg.ngo.repository.DonationRepository;


@Service
@Transactional
public class DonarServiceImplemnetation implements DonarService {

	
	@Autowired
	DonarRepository donorRepository;
	
	@Autowired
	private DonationRepository donationRepository;
	
	@Override
	public Donor registerDonor(Donor donor) throws DuplicateDonorException {
		Donor donor1 = donorRepository.findByDonorUserName(donor.getDonorUsername());
		
		if(donor1!=null) {
			if(donor1.equals(donor))
				throw new DuplicateDonorException("A donor with same name exists already");
		}
		return donorRepository.save(donor);

	}
@Override
	public Donor login(String username, String password) throws NoSuchDonorException {
		Donor donor = donorRepository.findByDonorUserNameAndDonorPassword(username, password);
		if(donor == null) {
			throw new NoSuchDonorException("No Matching Username And Password");
		}
		return donor;
	}

	@Override
	public Donation donateToNGO(Donation donation) {
		donation = donationRepository.save(donation);
		return donation;
	}
	}





