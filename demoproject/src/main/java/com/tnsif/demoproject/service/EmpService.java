package com.tnsif.demoproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.demoproject.model.Employee;
import com.tnsif.demoproject.repo.EmpRepo;
@Service
public class EmpService {
	@Autowired
	EmpRepo er;
	//insert
	public Employee addEmp(Employee emp) {
		return er.save(emp);
	}
}