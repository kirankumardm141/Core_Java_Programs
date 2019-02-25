package com.pragim.util;

import java.util.TreeSet;

import com.pragim.model.Employee;

public class TreeSetDemoWithEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TreeSet<Employee> ts = new TreeSet<Employee>();
		ts.add(new Employee(500, "john", 50000));
		ts.add(new Employee(121, "rahul", 80000));
		ts.add(new Employee(341, "mark", 30000));
		ts.add(new Employee(89, "smith", 60000));
		ts.add(new Employee(700, "will", 42000));
		ts.add(new Employee(200, "kumar", 40000));
		
		System.out.println(ts);
		
		
		

	}

}
