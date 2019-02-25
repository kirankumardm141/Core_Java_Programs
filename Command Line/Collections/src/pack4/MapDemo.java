package pack4;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
	
	public static void main(String[] args) {
		
		
		LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
		hm.put("sachin", 30);
		hm.put("dravid", 45);
		hm.put("sehwag", 70);
		hm.put("kohli", 69);
		hm.put("ashwin", 20);
		hm.put("jadeja", 35);
		hm.put("kohli", 90);
		System.out.println(hm);
		System.out.println(hm.get("kohli"));
		System.out.println(hm.isEmpty());
		System.out.println(hm.containsKey("sachinnn"));
		System.out.println(hm.containsValue(90));
		
		/*
		Set<String> keys = hm.keySet();
		System.out.println(keys);
		
		Collection<Integer> values = hm.values();
		System.out.println(values);
		
		
		Set<Entry<String,Integer>> entries = hm.entrySet();
		for (Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		Iterator<Entry<String,Integer>> itr = entries.iterator();
		while (itr.hasNext()) {
			Entry entry = itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		hm.remove("jadeja");
		System.out.println(hm);
		
		hm.clear();
		
		System.out.println(hm);*/
		
		
		
		
		
	}

}
