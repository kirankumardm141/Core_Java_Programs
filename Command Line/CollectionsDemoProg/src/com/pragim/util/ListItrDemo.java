package com.pragim.util;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListItrDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		ArrayList<String> animalList = new ArrayList<String>();
		
		animalList.add("lion");
		animalList.add("tiger");
		animalList.add("leopord");
		animalList.add("beer");
		animalList.add("cow");
		animalList.add("cat");
		
		System.out.println("=========Forward Dir============");
		ListIterator<String> listIterator = animalList.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		System.out.println("=========Backword Dir============");
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
		
		
		
		ArrayList<String> wildAni = new ArrayList<String>();
		wildAni.add("lion");
		wildAni.add("tiger");
		wildAni.add("leopord");
		wildAni.add("beer");
		
		ArrayList<String> demesAni= new ArrayList<String>();
		demesAni.add("cow");
		demesAni.add("cat");
		
		/*ListIterator<String> listIterator = animalList.listIterator();
		while (listIterator.hasNext()) {
			
			String animal = listIterator.next();
			if(wildAni.contains(animal))
				listIterator.set(animal+"-wild");
			else
				listIterator.set(animal+"-domestic");
		}
		System.out.println("modified list is");
		System.out.println(animalList);*/
		

	}

}
