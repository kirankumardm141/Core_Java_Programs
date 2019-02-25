package pack3;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo6 {
	
	public static void main(String[] args) {
		
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getStuName().compareTo(o2.getStuName());
			}
		});
		ts.add(new Student(200, "raj", 2450));
		ts.add(new Student(453, "ravi", 4567));
		ts.add(new Student(234, "kumar", 2345));
		ts.add(new Student(789, "rajesh", 789));
		ts.add(new Student(123, "testuser", 3456));
		
		System.out.println(ts);
	}

}
