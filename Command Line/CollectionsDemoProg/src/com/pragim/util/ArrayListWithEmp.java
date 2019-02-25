package com.pragim.util;

import java.util.ArrayList;

import com.pragim.model.Employee;

public class ArrayListWithEmp {

	public static void main(String[] args) {

		Employee e1 = new Employee(101, "kumar", 50000);
		Employee e2 = new Employee(88, "testuser", 70000);
		Employee e3 = new Employee(55, "ravi", 90000);
		Employee e4 = new Employee(77, "surya", 15900);
		Employee e5 = new Employee(66, "harsha", 44000);
		Employee e6 = new Employee(101, "kumar", 50000);

		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);

		ArrayList<Employee> filteredEmps = new ArrayList<Employee>();
		for (Employee employee : empList) {
			
			if(employee.getSal()>=50000)
				filteredEmps.add(employee);
			
		}
		
		//print all the filtered employees
		System.out.println("filtered employees");
		for (Employee employee : filteredEmps) {
			System.out.println(employee);
		}
		
		
		
		
		
		

	}

}
