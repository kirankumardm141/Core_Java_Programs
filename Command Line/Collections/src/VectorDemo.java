import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;


public class VectorDemo {
	
	public static void main(String[] args) {
		
		
		Vector<Integer> vector = new Vector<Integer>();
		
		for (int i = 1; i <=10; i++) {
			vector.add(i);
		}
		System.out.println(vector.size());
		System.out.println(vector.capacity());
		vector.add(110);
		System.out.println(vector.size());
		System.out.println(vector.capacity());
		
		
		Enumeration<Integer> enumaration = vector.elements();
		while(enumaration.hasMoreElements()){
			System.out.println(enumaration.nextElement());
		}
		System.out.println("==================================");
		Iterator<Integer> itr = vector.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
	}

}
