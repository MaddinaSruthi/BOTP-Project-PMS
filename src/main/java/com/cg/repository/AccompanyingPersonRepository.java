package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.pms.project.AccompanyingPerson;

public interface AccompanyingPersonRepository extends JpaRepository<AccompanyingPerson, Long>{
	// Add custom query methods if needed
	}