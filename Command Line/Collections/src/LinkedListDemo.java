import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> llist = new LinkedList<Integer>();
		
		for (int i = 1; i <=100; i++) {
			llist.add(i);
		}
		
		
		System.out.println(llist);
		
		/*llist.addFirst(100);
		llist.addLast(300);*/
		System.out.println(llist);
		
	/*	
		for (Integer integer : llist) {
			System.out.println(integer);
		}*/
		
		
		//ListIterator<Integer> litr = llist.listIterator();
		
		/*int count = 0;
		while (count<llist.size()) {
			System.out.println(llist.get(count));
			count++;
		}*/
		
		ListIterator<Integer> litr = llist.listIterator();
		System.out.println("========FD===========");
		while(litr.hasNext()){
			//System.out.println(litr.next());
			
			Integer no = litr.next();
			if(no%3==0)
				litr.remove();
			else if(no%5==0)
				litr.set(100);
			else if(no%7==0){
				if(litr.hasPrevious()){
					litr.previous();
					litr.add(13);
				}
			}
		
			
		}
		System.out.println(llist);
		
		
		
		
		
		
	}

}
