package collectionsprograms;

import java.util.TreeSet;

public class TreesetComparableDemoTeachers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Teachers> ts = new TreeSet<Teachers>();
		ts.add(new Teachers(10,"Narendra",30000));
		ts.add(new Teachers(9,"Ashok",20000));
		ts.add(new Teachers(1,"Ajay",50000));
		ts.add(new Teachers(2,"Sharat",10000));
		ts.add(new Teachers(7,"Kiran",5000));
		ts.add(new Teachers(3,"Amit",90000));
		
		System.out.println(ts);
		
		System.out.println(ts.descendingSet());

	}

}
