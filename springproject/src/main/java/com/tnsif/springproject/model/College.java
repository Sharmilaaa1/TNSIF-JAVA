package com.tnsif.springproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class College {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	 private long id;
	 private String CollegeAdmin;
	 private String CollegeName;
	 private String location;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCollegeAdmin() {
		return CollegeAdmin;
	}
	public   void setCollegeAdmin(String collegeAdmin) {
		CollegeAdmin = collegeAdmin;
	}
	public String getCollegeName() {
		return CollegeName;
	}
	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}