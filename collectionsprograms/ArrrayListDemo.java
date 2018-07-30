package collectionsprograms;

import java.util.ArrayList;

public class ArrrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al= new ArrayList<Integer>();
		for(int i=3;i<=30;i=i+3)
		{
			al.add(i);
		}
		System.out.println(al.size());
		System.out.println(al);
		
	   if(al.contains(27))
		   al.remove(new Integer(27));
	   System.out.println(al);
		
	   al.add(8,27);
	   System.out.println(al);
	}

}
