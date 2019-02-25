package com.pragim.model;

public class Student {

	private int stuId;
	private String stuName;
	private double marks;

	public Student(int stuId, String stuName, double marks) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", marks="
				+ marks + "]";
	}

	public int getStuId() {
		return stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public double getMarks() {
		return marks;
	}

}
