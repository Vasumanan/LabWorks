package com.cg.ngo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ngo.beans.Admin;
@Repository
public interface AdminRepository extends JpaRepository<Admin,String>{

}
