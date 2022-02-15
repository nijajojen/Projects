package com.nija;

import java.util.*;
import java.util.stream.Collectors;

public class CreateEmployee {

	public static void main(String[] args) {
		
		EmployeeDepartment engg= new EmployeeDepartment("Engineering",1);
		EmployeeDepartment finance= new EmployeeDepartment("finance", 2);
		EmployeeDepartment security =new EmployeeDepartment("Security", 3);
		
		Employee e1= new Employee();
		Employee e2= new Employee();
		Employee e3= new Employee();
		Employee e4= new Employee();
		
		e1.setName("Nija");
		e1.setDept(engg);
		
		e2.setName("Binoy");
		e2.setDept(finance);
		finance.setDeptHead(e2);
		
		e3.setName("alfie");
		e3.setDept(security);
		
		e4.setName("Andria");
		e4.setDept(security);
		
		List<Employee> employees= new ArrayList<Employee>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		
		Map<EmployeeDepartment, List<Employee>> grpByDept = employees.stream()
				.collect(Collectors.groupingBy(Employee:: getDepartment));		
		
		
		for(Map.Entry<EmployeeDepartment, List<Employee>> entIter: grpByDept.entrySet()) {
			System.out.println(((EmployeeDepartment)entIter.getKey()).getDeptName());
			for(ListIterator<Employee> iter=grpByDept.get(entIter.getKey()).listIterator(); iter.hasNext();)
					System.out.println(iter.next());
		}
			//can we create instances in a for loop if we have to create 100 instances.
			//can we duplicate instance names.
		
		
	}

}
