package collectionsprograms;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> obj = new Stack<Integer>();
		
		for (int i = 6; i <=60; i=i+6) {
			obj.push(i);
		}
		
		System.out.println("Stack Elements :"+obj);
		
		System.out.println("Top Element :"+obj.peek());
				
		System.out.println("Removing last Element of the stack :"+obj.pop());
			
		System.out.println("Stack Elements :"+obj);

   }
}
