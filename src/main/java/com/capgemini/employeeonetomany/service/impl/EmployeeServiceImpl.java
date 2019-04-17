package com.capgemini.employeeonetomany.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.employeeonetomany.dao.EmployeeDao;
import com.capgemini.employeeonetomany.entity.Certificate;
import com.capgemini.employeeonetomany.entity.Employee;
import com.capgemini.employeeonetomany.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;

	@Override
	public Employee addEmployee(Employee employee) {

		dao.save(employee);
		return employee;
	}

	@Override
	public Employee getEmployee(int id) {

		Employee employee = dao.findById(id).get();

		return employee;
	}

}
