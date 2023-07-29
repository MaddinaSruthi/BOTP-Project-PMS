package com.cg.service;

import org.springframework.stereotype.Service;

import com.cg.pms.project.HospitalCapacity;
import com.cg.repository.HospitalCapacityRepository;

@Service
public class HospitalCapacityService {
private final HospitalCapacityRepository hospitalCapacityRepository;

// Constructor injection
public HospitalCapacityService(HospitalCapacityRepository hospitalCapacityRepository) {
this.hospitalCapacityRepository = hospitalCapacityRepository;
}

public HospitalCapacity getHospitalCapacity() {
	// For simplicity, let's assume there's only one entry in the HospitalCapacity table
	// representing the current capacity status of the hospital.
	return hospitalCapacityRepository.findAll().stream().findFirst()
	.orElseThrow(() -> new RuntimeException("Hospital capacity information not found."));
	}

// Add methods to handle hospital capacity-related operations
}