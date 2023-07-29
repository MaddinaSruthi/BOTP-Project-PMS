package com.cg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.pms.project.HospitalCapacity;
import com.cg.service.HospitalCapacityService;

@RestController
@RequestMapping("/hospital-capacity")
public class HospitalCapacityController {
private final HospitalCapacityService hospitalCapacityService;

// Constructor injection
public HospitalCapacityController(HospitalCapacityService hospitalCapacityService) {
this.hospitalCapacityService = hospitalCapacityService;
}

@GetMapping
public HospitalCapacity getHospitalCapacity() {
return hospitalCapacityService.getHospitalCapacity();
}
// Add endpoints for hospital capacity operations
}