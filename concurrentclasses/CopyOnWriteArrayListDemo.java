package concurrentclasses;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CopyOnWriteArrayList<Integer> obj = new CopyOnWriteArrayList<Integer>();
		
		for(int i=5;i<=50;i=i+5)
		{
			obj.add(i);
		}
		
		System.out.println(obj);
		
		for (Integer integer : obj) {
			if(integer == 35) {
				obj.remove(new Integer(integer));
				System.out.println("Element Removed :"+integer);
			}
		}
		
		System.out.println("Using this Array List we can iterate and remove elements at the same time i.e Concurrency");
		
		System.out.println(obj);

	}

}
