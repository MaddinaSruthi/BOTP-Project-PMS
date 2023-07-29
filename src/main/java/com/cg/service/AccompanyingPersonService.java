package com.cg.service;

import org.springframework.stereotype.Service;

import com.cg.pms.project.AccompanyingPerson;
import com.cg.repository.AccompanyingPersonRepository;

@Service
public class AccompanyingPersonService {
private final AccompanyingPersonRepository accompanyingPersonRepository;

// Constructor injection
public AccompanyingPersonService(AccompanyingPersonRepository accompanyingPersonRepository) {
this.accompanyingPersonRepository = accompanyingPersonRepository;
}

public AccompanyingPerson addAccompanyingPerson(AccompanyingPerson accompanyingPerson) {
return accompanyingPersonRepository.save(accompanyingPerson);
}

public AccompanyingPerson getAccompanyingPerson(Long id) {
return accompanyingPersonRepository.findById(id)
.orElseThrow(() -> new RuntimeException("Accompanying Person not found with id: " + id));
}

public AccompanyingPerson updateAccompanyingPerson(Long id, AccompanyingPerson updatedAccompanyingPerson) {
AccompanyingPerson existingAccompanyingPerson = getAccompanyingPerson(id);
// Update fields of existingAccompanyingPerson with data from updatedAccompanyingPerson
// Set the updated values for name, contactNumber, idProofDetails, etc.

return accompanyingPersonRepository.save(existingAccompanyingPerson);
}

// Add methods to handle accompanying person-related operations
}

