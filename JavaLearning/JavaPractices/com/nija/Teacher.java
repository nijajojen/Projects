package com.nija;

public class Teacher extends Person {
	String role;
	String subject;
	int salary;
	public void setDetails(String role, String subject, int salary) {
		this.role= role;
		this.subject= subject;
		this.salary= salary;
				
		
	}
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
	
	return "role: "+ role+ "subject: "+ subject+ "salary: "+ salary;
		
	}
	
	

}
