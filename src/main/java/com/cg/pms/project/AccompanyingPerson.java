package com.cg.pms.project;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

@Entity
public class AccompanyingPerson {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
private String contactNumber;
private String idProofDetails;
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
public String getContactNumber() {
	return contactNumber;
}
public void setContactNumber(String contactNumber) {
	this.contactNumber = contactNumber;
}
public String getIdProofDetails() {
	return idProofDetails;
}
public void setIdProofDetails(String idProofDetails) {
	this.idProofDetails = idProofDetails;
}
@Override
public String toString() {
	return "AccompanyingPerson [id=" + id + ", name=" + name + ", contactNumber=" + contactNumber + ", idProofDetails="
			+ idProofDetails + "]";
}


}