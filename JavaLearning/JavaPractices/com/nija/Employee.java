package com.nija;

public class Employee {

	
		// Map<Department, List<Employee>> byDept = employees.stream()
		//.collect(Collectors.groupingBy(Employee::getDepartment));

	
	
	
	String name;
	EmployeeDepartment dept;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public EmployeeDepartment getDepartment() {
		return dept;
	}
	public void setDept(EmployeeDepartment dept) {
		this.dept = dept;
	}
	
	// why cant we print system.out.println here?
	//System.out.println(id+ name+ age+  dept );
	
	
	

}
