package com.capgemini.employeeonetomany.service;

import com.capgemini.employeeonetomany.entity.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);
	public Employee getEmployee(int id);
	
}
