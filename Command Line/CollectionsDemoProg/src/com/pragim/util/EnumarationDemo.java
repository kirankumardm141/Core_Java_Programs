package com.pragim.util;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;


public class EnumarationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Vector<Integer> vector = new Vector<Integer>();
		for (int i = 10; i <=100; i=i+10) {
			vector.addElement(i);
		}
		System.out.println(vector);
		
		Enumeration<Integer> enumObj = vector.elements();
		//System.out.println(enumObj.getClass());
		while(enumObj.hasMoreElements()){
			System.out.println(enumObj.nextElement());
		}
	}

}
