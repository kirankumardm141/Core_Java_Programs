package mapprograms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> obj = new HashMap<Integer, String>();

		obj.put(101, "Amit");
		obj.put(108, "Arun");
		obj.put(102, "Kiran");
		obj.put(103, "Ashwin");
		obj.put(109, "Ankitha");
		obj.put(108, "Praveen");

		System.out.println(obj);

		System.out.println(obj.getClass());

		System.out.println("Removed Map Element :" + obj.remove(101));

		System.out.println(obj.get(101));

		System.out.println(obj.get(102));

		System.out.println(obj);

		Set<Integer> keySet = obj.keySet();

		System.out.println(keySet);

		System.out.println(keySet.getClass());

		Collection<String> values = obj.values();

		System.out.println(values);

		System.out.println(values.getClass());

		Set<Entry<Integer, String>> entrySet = obj.entrySet();

		System.out.println(entrySet.getClass());

		System.out.println(entrySet);

		Iterator<Entry<Integer, String>> itr = entrySet.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("<----OR---->");

		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
		}

	}

}
