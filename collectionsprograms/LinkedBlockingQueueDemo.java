package collectionsprograms;

import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedBlockingQueue<Integer> obj = new LinkedBlockingQueue<Integer>();
		
		for(int i=3;i<=33;i=i+3)
		{
			obj.offer(i);
		}

		System.out.println(obj);
		
		System.out.println("Removing First Element :"+obj.poll());
		
		System.out.println(obj);
		
        System.out.println("Removing First Element :"+obj.poll());
		
		System.out.println(obj);
	}

}
