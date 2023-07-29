package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.pms.project.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long>{
// Add custom query methods if needed
}