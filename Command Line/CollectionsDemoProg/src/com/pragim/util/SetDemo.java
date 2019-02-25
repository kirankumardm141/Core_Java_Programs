package com.pragim.util;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedHashSet<Integer> data = new LinkedHashSet<Integer>();
		for(int i=20;i<=200;i=i+20)
			data.add(i);
		
		data.add(20);
		data.add(null);
		data.add(null);
		System.out.println(data);

	}

}
//op - [80, 160, 20, 100, 180, 40, 120, 200, 60, 140]
