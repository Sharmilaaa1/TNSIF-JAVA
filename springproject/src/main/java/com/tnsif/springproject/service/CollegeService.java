package com.tnsif.springproject.service;

import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.tnsif.springproject.model.College;
import com.tnsif.springproject.repo.CollegeRepo;

@Service
public class CollegeService {
@Autowired
CollegeRepo cr;
//insert
public College addcol(College col)
{
	return cr.save(col);
}
//retrieve all  the data
public List<College>getAllCol(){
	return cr.findAll();	
}
//retrieving data by id
public Optional<College>getCollegeById(Long id){
	return cr.findById(id);
}
//updating the data 
public  College updateCol(Long Id,College collegedetails) {
	College col=cr.findById(Id).get();
	col.setCollegeAdmin(collegedetails.getCollegeAdmin());
	col.setCollegeName(collegedetails.getCollegeName());
	col.setLocation(collegedetails.getLocation());
	return cr.save(col);
}
//delete by id
public void delete(long id) {
	 cr.deleteById(id);
}
//deleting all rows
public void deleteAllColleges() {
	cr.deleteAll();
}
}