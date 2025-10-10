package com.tnsif.demoproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.demoproject.model.Employee;
import com.tnsif.demoproject.service.EmpService;
@RestController
public class EmpController {
	@Autowired
	EmpService es;
	@PostMapping("/addEmployee")
	public Employee addEmp( @RequestBody Employee emp) {
		return emp;
	}	
}