package pack4;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		
		
		TreeMap<String, Integer> hm = 
	new TreeMap<String, Integer>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return -o1.compareTo(o2);
			}
		});
		hm.put("sachin", 30);
		hm.put("dravid", 45);
		hm.put("sehwag", 70);
		hm.put("kohli", 69);
		hm.put("ashwin", 20);
		hm.put("jadeja", 35);
		hm.put("kohli", 90);
		System.out.println(hm);
		
		//System.out.println(hm.descendingMap());
		
		
	}

}
