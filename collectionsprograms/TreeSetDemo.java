package collectionsprograms;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> obj = new TreeSet<Integer>();
		
		obj.add(50);
		obj.add(90);
		for (int i = 2; i <=20; i=i+2) {
			obj.add(i);
		}
		
		System.out.println(obj);
		
		System.out.println("Tree Set in Descending Order");
		
		System.out.println(obj.descendingSet());
		
		System.out.println("Adding Characters : ");
		
		TreeSet<Character> ts = new TreeSet<Character>();
		
		ts.add('k');
		ts.add('i');
		ts.add('r');
		ts.add('a');
		ts.add('n');
		System.out.println(ts);
		
		System.out.println("Tree Set in Descending Order");
		
		System.out.println(ts.descendingSet());
	}

}
