package com.pragim.util;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {

	public static void main(String[] args) {
	
		TreeSet<Integer> ts = new TreeSet<Integer>(new MyComparator());
		ts.add(50);
		ts.add(90);
		ts.add(14);
		ts.add(63);
		ts.add(92);
		ts.add(105);
		ts.add(71);
		System.out.println(ts);

	}

}
class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1<o2?1:o1>o2?-1:0;
	}
	
}
