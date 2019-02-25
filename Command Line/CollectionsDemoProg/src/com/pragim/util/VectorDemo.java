package com.pragim.util;

import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Vector<Integer> elemList = new Vector<Integer>();
		
		for (int i = 10; i <=100; i=i+10) {
			elemList.add(i);
		}
		
		System.out.println(elemList);
		elemList.add(300);
		System.out.println(elemList.capacity()+" "+elemList.size());
		
		
		elemList.remove(new Integer(80));
		System.out.println(elemList);
		
		elemList.add(3, 35);
		System.out.println(elemList);
		

		
		

	}

}
