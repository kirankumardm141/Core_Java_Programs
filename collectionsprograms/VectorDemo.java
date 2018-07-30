package collectionsprograms;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Integer> obj= new Vector<Integer>();
		for (int i = 4; i <=40; i=i+4) {
			obj.add(i);
		}
		
		System.out.println("Vector Elements :" +obj);
		
		obj.remove(2);
		
		System.out.println("New Vector :" +obj);
	}

}
