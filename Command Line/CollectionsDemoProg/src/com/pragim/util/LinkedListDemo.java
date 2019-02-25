package com.pragim.util;

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		
		LinkedList<Integer> obj = new LinkedList<Integer>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(1, 15);
		System.out.println(obj);
		
		
		for (int i = obj.size()-1; i >=0; i--) {
			System.out.println(obj.get(i));
		}
		
	}

}
