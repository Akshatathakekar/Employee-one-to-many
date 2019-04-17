package com.capgemini.employeeonetomany.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.employeeonetomany.entity.Certificate;
import com.capgemini.employeeonetomany.entity.Employee;
import com.capgemini.employeeonetomany.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	
	@RequestMapping("/")
	public Employee addEmployeeDetails() {
		
	
		Set<Certificate> certificates=new HashSet<>();
		certificates.add(new Certificate(11,"JAVA"));
		certificates.add(new Certificate(12,"ORACLE"));
		Employee employee=service.addEmployee(new Employee(101,"Akshata",certificates));
		return employee;
	}

	@RequestMapping("/get")
	public Employee getEmployeeDetails() {
		Employee employee = service.getEmployee(101);
		return employee;
	}


}
