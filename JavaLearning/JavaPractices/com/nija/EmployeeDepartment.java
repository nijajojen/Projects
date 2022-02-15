package com.nija;

public class EmployeeDepartment {
	String deptName;
	int deptId;
	Employee deptHead;
	
	
	public EmployeeDepartment(String deptName, int deptId) {
		this.deptName= deptName;
		this.deptId= deptId;
	}
	
	
	
	
	
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public Employee getDeptHead() {
		return deptHead;
	}
	public void setDeptHead(Employee deptHead) {
		this.deptHead = deptHead;
	}

}
