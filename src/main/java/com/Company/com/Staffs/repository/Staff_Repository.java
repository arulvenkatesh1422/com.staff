package com.Company.com.Staffs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Company.com.Staffs.model.Staff;

@Repository
public interface Staff_Repository extends JpaRepository<Staff, Long> {
	

}
