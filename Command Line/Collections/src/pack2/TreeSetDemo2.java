package pack2;

import java.util.TreeSet;

public class TreeSetDemo2 {
	
	public static void main(String[] args) {
		
		
		TreeSet<Employee> ts = new TreeSet<Employee>();
		
		ts.add(new Employee(101, "John", 50000));
		ts.add(new Employee(135, "ravi", 56000));
		ts.add(new Employee(345, "kiran", 45000));
		ts.add(new Employee(235, "surya", 95000));
		ts.add(new Employee(88, "venkat", 100000));
		
		System.out.println(ts);
		
		
		
		
	}

}
