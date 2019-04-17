package com.capgemini.employeeonetomany.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="certificate")
public class Certificate {

	@Id
	private int id;
	private String name;

	@ManyToOne(cascade=CascadeType.ALL)
	private Employee employee;

	
	public Certificate(int id, String name) {
		super();
	this.id = id;
	this.name = name;
}

	public Certificate() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public Employee getEmployee() {
//		return employee;
//	}

//	public void setEmployee(Employee employee) {
//		this.employee = employee;
//	}

	@Override
	public String toString() {
		return "Certificate [id=" + id + ", name=" + name + "]";
	}

	
	
}
