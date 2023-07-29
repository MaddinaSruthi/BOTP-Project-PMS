package com.cg.pms.project;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

@Entity
public class HospitalCapacity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private int numberOfBeds;
private int numberOfRooms;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public int getNumberOfBeds() {
	return numberOfBeds;
}
public void setNumberOfBeds(int numberOfBeds) {
	this.numberOfBeds = numberOfBeds;
}
public int getNumberOfRooms() {
	return numberOfRooms;
}
public void setNumberOfRooms(int numberOfRooms) {
	this.numberOfRooms = numberOfRooms;
}
@Override
public String toString() {
	return "HospitalCapacity [id=" + id + ", numberOfBeds=" + numberOfBeds + ", numberOfRooms=" + numberOfRooms + "]";
}


}