package pack3;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueDemo {
	
	
	public static void main(String[] args) {
		
		
		
		LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>();
		for (int i = 1; i <=11; i++) {
			queue.offer(i);
		}
		System.out.println(queue);
		queue.remove();
		
		System.out.println(queue);
		
		
		
	}

}
