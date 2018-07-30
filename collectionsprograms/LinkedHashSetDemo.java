package collectionsprograms;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<Integer> obj = new LinkedHashSet<Integer>();
		for (int i = 5; i <=55; i=i+5) {
			obj.add(i);
		}
		
		System.out.println(obj);
		
		System.out.println("Duplicates are not allowed  i.e 50 is not added to the Hash Set");
		
		obj.add(50);
		
		obj.add(60);
		System.out.println(obj);
		
	}

}
