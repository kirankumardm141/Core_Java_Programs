package collectionsprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListIntoTreeSetComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(10,"Kiran",37142));
		al.add(new Employee(9,"Ashwin",30142));
		al.add(new Employee(10,"Amit",37562));
		al.add(new Employee(1,"Ashwin",37852));
		al.add(new Employee(6,"Pooja",54000));
		al.add(new Employee(8,"Ankitha",60000));
		
		System.out.println("Array List Elements");
		System.out.println(al);
		
		/*TreeSet<Employee> ts = new TreeSet<Employee>(al);
		
		System.out.println(ts);*/
		
		
		
		Collections.sort(al,new EmployeeComparator());
		
		System.out.println("Sorted ArrayList :");
		System.out.println(al);
		

	}

}

class EmployeeComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return (o1.getID()<o2.getID())?-1:(o1.getID()>o2.getID())?1:0;
	}
	
}
