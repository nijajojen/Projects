package com.project.assignment.EmployeeProject.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Component {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="serialNo")
	private int serialNo;
	@Column(name="compName")
	private String compName;
	@Column(name="compType")
	private String compType;
	@Column(name="compAmt")
	private int compAmt;
	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	public String getCompType() {
		return compType;
	}
	public void setCompType(String compType) {
		this.compType = compType;
	}
	public int getCompAmt() {
		return compAmt;
	}
	public void setCompAmt(int compAmt) {
		this.compAmt = compAmt;
	}
	
	
	

}
