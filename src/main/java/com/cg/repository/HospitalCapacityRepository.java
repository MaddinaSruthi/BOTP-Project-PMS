package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.pms.project.HospitalCapacity;

public interface HospitalCapacityRepository extends JpaRepository<HospitalCapacity, Long> {
	// Add custom query methods if needed
	}