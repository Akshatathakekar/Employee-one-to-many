package com.capgemini.employeeonetomany.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.employeeonetomany.entity.Certificate;
import com.capgemini.employeeonetomany.entity.Employee;


@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
