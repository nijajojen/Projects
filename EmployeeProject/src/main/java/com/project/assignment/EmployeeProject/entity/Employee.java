package com.project.assignment.EmployeeProject.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@Column(name="id")
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="emailId")
	private String emailId;
	
	/*@OneToMany(mappedBy="employee")
	private List<Earning> earningList;*/

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

/*	public List<Earning> getEarningList() {
		return earningList;
	}

	public void setEarningList(List<Earning> earningList) {
		this.earningList = earningList;
	}*/
	
}
