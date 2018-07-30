package mapprograms;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Integer,String> obj = new LinkedHashMap<Integer,String>();

		obj.put(101, "Amit");
		obj.put(108, "Arun");
		obj.put(102, "Kiran");
		obj.put(103, "Ashwin");
		obj.put(109, "Ankitha");
		obj.put(108, "Praveen");
		
		System.out.println(obj);
	}

}
