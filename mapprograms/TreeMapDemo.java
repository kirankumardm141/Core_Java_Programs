package mapprograms;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String, Double> tm = new TreeMap<String, Double>(new namecomparator());

		tm.put("Kiran", 20000d);
		tm.put("Amit", 10000d);
		tm.put("Zaheer", 30000d);
		tm.put("Ashwin", 8000d);
		tm.put("Praveen", 60000d);
		tm.put("Ankitha", 90000d);

		System.out.println(tm);
	}
}

class namecomparator implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
}
