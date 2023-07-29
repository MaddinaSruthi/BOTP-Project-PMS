package com.cg.service;

import org.springframework.stereotype.Service;

import com.cg.pms.project.Patient;
import com.cg.repository.PatientRepository;

@Service
public class PatientService {
private final PatientRepository patientRepository;

// Constructor injection
public PatientService(PatientRepository patientRepository) {
this.patientRepository = patientRepository;
}
public Patient addPatient(Patient patient) {
return patientRepository.save(patient);
}

public Patient getPatient(Long id) {
return patientRepository.findById(id)
.orElseThrow(() -> new RuntimeException("Patient not found with id: " + id));
}

public Patient updatePatient(Long id, Patient updatedPatient) {
Patient existingPatient = getPatient(id);
// Update fields of existingPatient with data from updatedPatient
// Set the updated values for name, dateOfBirth, address, etc.

return patientRepository.save(existingPatient);
}

}
// Add methods for patient history tracking and other operations
// Add methods to handle patient-related operations like onboarding, editing, and history tracking