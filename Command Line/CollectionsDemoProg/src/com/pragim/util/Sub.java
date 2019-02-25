package com.pragim.util;

class Super
{
	@Override
	public String toString() {
		return "superclass toString method()";
	}
	
}

public class Sub extends Super{
	
	public static void main(String[] args) {
		
		Sub obj = new Sub();
		System.out.println(obj.toString());
	
		
	}

}
