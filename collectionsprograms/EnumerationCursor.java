package collectionsprograms;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationCursor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Integer> obj = new Vector<Integer>();
		for (int i = 7; i <= 70; i=i+7) {
			obj.add(i);
		}
		
		
		System.out.println("Iterating using For Each loop");
		for (Integer integer : obj) {
			System.out.println(integer+"  ");
		}
		
		System.out.println("Iterating using for loop");
		for (int i = 0; i < obj.size(); i++) {
			System.out.println(obj.get(i));
		}
		
		
		System.out.println(obj);
		
	    Enumeration<Integer> elements = obj.elements();
	    
	    System.out.println("Iterating using Enumeration Cursor");
	    
	    while (elements.hasMoreElements()) {
			//Integer integer = (//Integer) elements.nextElement();
	    	System.out.println(elements.nextElement());
		}
	    System.out.println(elements.getClass());
	}

}
