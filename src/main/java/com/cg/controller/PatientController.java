package com.cg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.pms.project.Patient;
import com.cg.service.PatientService;

@RestController
@RequestMapping("/patients")
public class PatientController {
private final PatientService patientService;

// Constructor injection
public PatientController(PatientService patientService) {
this.patientService = patientService;
}

@PostMapping
public Patient addPatient(@RequestBody Patient patient) {
return patientService.addPatient(patient);
}

@GetMapping("/{id}")
public Patient getPatient(@PathVariable Long id) {
return patientService.getPatient(id);
}

@PutMapping("/{id}")
public Patient updatePatient(@PathVariable Long id, @RequestBody Patient patient) {
return patientService.updatePatient(id, patient);
}




// Add endpoints for patient onboarding, editing, and history tracking
}