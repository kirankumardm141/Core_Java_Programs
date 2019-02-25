import java.util.Stack;


public class StackDemo {
	
	public static void main(String[] args) {
		
		Stack<Integer> obj = new Stack<Integer>();
		
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		obj.push(50);
		
		System.out.println(obj);
		if(!obj.isEmpty())
		System.out.println(obj.pop());
		System.out.println(obj);
		System.out.println(obj.peek());
		System.out.println(obj.search(30));
		
		obj.clear();
		if(!obj.isEmpty())
		obj.pop();
		
		
	}

}
