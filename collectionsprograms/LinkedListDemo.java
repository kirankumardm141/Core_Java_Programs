package collectionsprograms;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Adding Integer Values :");
		LinkedList<Integer> obj = new LinkedList<Integer>();
		obj.add(10);
		obj.add(20);
		System.out.println("Initial Linked List :" +obj);
		obj.addFirst(5);
		obj.add(30);
		obj.addLast(40);
		obj.add(50);
		System.out.println("Final List :"+obj);
		
		System.out.println("Adding Employee Values :");
		
		LinkedList<Employee> emplist = new LinkedList<Employee>();
		emplist.add(new Employee(1,"Praveen",50000));
		emplist.add(new Employee(2,"Ankitha",200000));
		emplist.add(new Employee(3,"Abhi",300000));
		emplist.add(new Employee(4,"Sristi",500000));
		
		for (int i = 0; i < emplist.size(); i++) {
			System.out.println("Employee List :"+ emplist.get(i));
		}
		
		LinkedList<Employee> filteredemps = new LinkedList<Employee>();
		for (Employee employee : emplist) {
			if(employee.getSalary()>250000)
				filteredemps.add(employee);
		}
		
		System.out.println("Filtered Emps ->");
		for (Employee employee : filteredemps) {
			System.out.println("Filtered Emps :" +employee);
		}
		
		

	}

}
