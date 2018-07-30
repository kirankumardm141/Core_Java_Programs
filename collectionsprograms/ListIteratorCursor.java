package collectionsprograms;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorCursor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<String>();
		al.add("Lion");
		al.add("Dog");
		al.add("Deer");
		al.add("Cheetah");
		al.add("Rabbit");
		al.add("Cow");
		al.add("Buffalo");
		al.add("Tiger");
		
		
		ListIterator<String> li = al.listIterator();
		
		System.out.println("Forward Direction");
		while(li.hasNext())
			System.out.println(li.next());
		
		System.out.println("Backward Direction");
		while(li.hasPrevious())
			System.out.println(li.previous());
		
		ArrayList<String> wildAni = new ArrayList<String>();
		wildAni.add("Lion");
		wildAni.add("Cheetah");
		wildAni.add("Deer");
		wildAni.add("Tiger");
		
		ArrayList<String> domesticAni = new ArrayList<String>();
		domesticAni.add("Cow");
		domesticAni.add("Dog");
		domesticAni.add("Rabbit");
		domesticAni.add("Buffalo");
		
		while(li.hasNext())
		{
			String animal=li.next();
			if(wildAni.contains(animal))
					li.set(animal+"-Wild");
			else
				li.set(animal+"-Domestic");
		}
		
		System.out.println(al);
		
	}

}
