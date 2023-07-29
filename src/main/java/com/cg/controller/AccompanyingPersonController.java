package com.cg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.pms.project.AccompanyingPerson;
import com.cg.service.AccompanyingPersonService;

@RestController
@RequestMapping("/accompanying-persons")
public class AccompanyingPersonController {
private final AccompanyingPersonService accompanyingPersonService;

// Constructor injection
public AccompanyingPersonController(AccompanyingPersonService accompanyingPersonService) {
this.accompanyingPersonService = accompanyingPersonService;
}

@PostMapping
public AccompanyingPerson addAccompanyingPerson(@RequestBody AccompanyingPerson accompanyingPerson) {
return accompanyingPersonService.addAccompanyingPerson(accompanyingPerson);
}

@GetMapping("/{id}")
public AccompanyingPerson getAccompanyingPerson(@PathVariable Long id) {
return accompanyingPersonService.getAccompanyingPerson(id);
}

@PutMapping("/{id}")
public AccompanyingPerson updateAccompanyingPerson(@PathVariable Long id, @RequestBody AccompanyingPerson accompanyingPerson) {
return accompanyingPersonService.updateAccompanyingPerson(id, accompanyingPerson);
}
// Add endpoints for accompanying person operations
}