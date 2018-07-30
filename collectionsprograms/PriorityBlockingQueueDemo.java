package collectionsprograms;

import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityBlockingQueue<Integer> obj = new PriorityBlockingQueue<Integer>();
		
		/*for(int i=9;i<=99;i=i+9)
		{
			obj.offer(i);
		}
		
		System.out.println(obj);
		
		System.out.println("Removing First Element :"+ obj.poll());
		
		System.out.println(obj);
		
		System.out.println("Removing First Element :"+ obj.poll());
		
		System.out.println(obj);*/
		
//		for (int i = 7; i <=84; i=i+7) {
//			obj.offer(i);
//		}
		
		obj.offer(5);
		obj.offer(2);
		obj.offer(13);
		obj.offer(7);
		obj.offer(12);
		obj.offer(3);
		
		System.out.println(obj);
		
		System.out.println("First Element :"+obj.peek());
		
		System.out.println("Removed First Element :"+obj.poll());
		
		System.out.println("Now First Element :"+obj.peek());
		
		System.out.println(obj);
		
		System.out.println("Removed First Element :"+obj.poll());
		
		System.out.println(obj);

	}

}
