package mapprograms;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer,Double> ht = new Hashtable<Integer,Double>();
		
		ht.put(101, 1000d);
		ht.put(108,2000d);
		ht.put(102,8000d);
		ht.put(103,5000d);
		ht.put(109,9000d);
		ht.put(108,3000d);
		
		System.out.println(ht);
	}

}
