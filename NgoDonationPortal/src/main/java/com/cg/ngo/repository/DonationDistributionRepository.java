package com.cg.ngo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.ngo.beans.DonationDistribution;
import com.cg.ngo.beans.Employee;
@Repository
public interface DonationDistributionRepository extends JpaRepository<DonationDistribution,Long>{

}
