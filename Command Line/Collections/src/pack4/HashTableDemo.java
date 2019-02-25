package pack4;

import java.awt.Robot;
import java.util.Hashtable;
import java.util.LinkedHashMap;

public class HashTableDemo {
	
	public static void main(String[] args) {
		
		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
		hm.put(30,"hello");
		hm.put(45,"testuser1");
		hm.put(70,"testuser2");
		hm.put(69,"testuser1");
		hm.put(20,"testuser1");
		hm.put(35,"testuser1");
		hm.put(90,"testuser1");
		
		System.out.println(hm);
		
		
		
		
	}

}
