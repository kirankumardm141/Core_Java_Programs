package concurrentclasses;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConcurrentHashMap<Integer, String> obj = new ConcurrentHashMap<Integer,String>();
		
		obj.put(3,"Kiran");
		obj.put(2,"Ashok");
		obj.put(1,"Arun");
		obj.put(5,"Sharat");
		obj.put(8,"Ashwin");
		obj.put(9,"Praveen");
		
		System.out.println(obj);
		
		Set<Entry<Integer, String>> entrySet = obj.entrySet();
		
		Iterator<Entry<Integer, String>> itr = entrySet.iterator();
		
		while(itr.hasNext())
		{
			Entry<Integer, String> next = itr.next();
			if(next.getKey()==1)
				obj.remove(next.getKey());
			
		}
		
		System.out.println(obj);
		

	}

}
