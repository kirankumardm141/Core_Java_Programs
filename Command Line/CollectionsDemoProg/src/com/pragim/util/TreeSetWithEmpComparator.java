package com.pragim.util;

import java.util.Comparator;
import java.util.TreeSet;

import com.pragim.model.Employee;
import com.pragim.model.Student;

public class TreeSetWithEmpComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TreeSet<Student> ts = new TreeSet<Student>
		(new StudentComparator());
		
		ts.add(new Student(5, "john", 500));
		ts.add(new Student(3, "rahul", 700));
		ts.add(new Student(4, "mark", 900));
		ts.add(new Student(1, "smith", 450));
		ts.add(new Student(6, "will", 550));
		ts.add(new Student(2, "kumar", 905));
		
		System.out.println(ts);

	}

}
class StudentComparator implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		double d1 = o1.getMarks();
		double d2 = o2.getMarks();		
		return d1<d2?-1:d1>d2?1:0;
	}
}

