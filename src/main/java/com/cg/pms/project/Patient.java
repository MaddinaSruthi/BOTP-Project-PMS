package com.cg.pms.project;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

@Entity
public class Patient {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
private LocalDate dateOfBirth;
private String address;
private String idProofDetails;
private String contactNumber;
private String emergencyContactNumber;
private String primaryIllness;
private String symptoms;
private String healthInsurance;
private String preferredDoctorGender;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public LocalDate getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(LocalDate dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getIdProofDetails() {
	return idProofDetails;
}
public void setIdProofDetails(String idProofDetails) {
	this.idProofDetails = idProofDetails;
}
public String getContactNumber() {
	return contactNumber;
}
public void setContactNumber(String contactNumber) {
	this.contactNumber = contactNumber;
}
public String getEmergencyContactNumber() {
	return emergencyContactNumber;
}
public void setEmergencyContactNumber(String emergencyContactNumber) {
	this.emergencyContactNumber = emergencyContactNumber;
}
public String getPrimaryIllness() {
	return primaryIllness;
}
public void setPrimaryIllness(String primaryIllness) {
	this.primaryIllness = primaryIllness;
}
public String getSymptoms() {
	return symptoms;
}
public void setSymptoms(String symptoms) {
	this.symptoms = symptoms;
}
public String getHealthInsurance() {
	return healthInsurance;
}
public void setHealthInsurance(String healthInsurance) {
	this.healthInsurance = healthInsurance;
}
public String getPreferredDoctorGender() {
	return preferredDoctorGender;
}
public void setPreferredDoctorGender(String preferredDoctorGender) {
	this.preferredDoctorGender = preferredDoctorGender;
}
@Override
public String toString() {
	return "Patient [id=" + id + ", name=" + name + ", address=" + address + ", idProofDetails=" + idProofDetails
			+ ", contactNumber=" + contactNumber + ", emergencyContactNumber=" + emergencyContactNumber
			+ ", primaryIllness=" + primaryIllness + ", symptoms=" + symptoms + ", healthInsurance=" + healthInsurance
			+ ", preferredDoctorGender=" + preferredDoctorGender + "]";
}


}