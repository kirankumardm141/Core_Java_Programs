package collectionsprograms;

import java.util.ArrayList;

public class EmployeeArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> al= new ArrayList<Employee>();
		
		Employee e1= new Employee(1,"Kiran",1000);
		Employee e2 =new Employee(2,"Amit",2000);
		al.add(e1);
		al.add(e2);
		al.add(new Employee(3,"Ashwin",3000));
		al.add(new Employee(4,"Rishi",5000));
		
		System.out.println("List of Employees :"+al);
		
		ArrayList<Employee> filteredEmp = new ArrayList<Employee>();
		for (Employee employee : al) {
			if(employee.getSalary()<3000)
				filteredEmp.add(employee);
		}
		
		System.out.println("Filtered Employees :"+ filteredEmp);
		

	}

}
