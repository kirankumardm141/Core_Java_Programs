package com.pragim.util;

import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		
		
		Stack<Integer> obj = new Stack<Integer>();
		
		for (int i = 15; i <=105; i=i+15) {
			obj.push(i);
		}
		System.out.println(obj);
		obj.pop();
		System.out.println(obj);
		
		System.out.println(obj.peek());
		
		if(obj.size() == 0)
			System.out.println("collection is empty");
		else
			System.out.println("not empty");
		
		
	
		
		
	}

}
