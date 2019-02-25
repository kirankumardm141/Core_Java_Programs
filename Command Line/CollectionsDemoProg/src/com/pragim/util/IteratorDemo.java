package com.pragim.util;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<=115;i=i+9){
			al.add(i);
		}	
		System.out.println(al);
		// java.util.ConcurrentModificationException
		/*for (Integer integer : al) {
			
			if(integer == 72)
				al.remove(integer);
		}*/
		Iterator<Integer> iterator = al.iterator();
		while(iterator.hasNext()){
			Integer i1 = iterator.next();
			if(i1 == 72)
				iterator.remove();
		}
		System.out.println(al);
	}

}
