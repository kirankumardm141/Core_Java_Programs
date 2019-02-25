package com.pragim.model;

public class Employee implements Comparable<Employee>{

	private int id;
	private String name;
	private double sal;

	public Employee(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public String toString(){
		
		return id+" "+name+" "+sal;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	public double getSal() {
		return sal;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		
		String name1 = this.getName();
		String name2 = o.getName();
		
		return -name1.compareTo(name2);
	}

}
