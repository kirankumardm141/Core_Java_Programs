package collectionsprograms;

import java.util.ArrayList;
import java.util.TreeSet;

public class ArrayListIntoTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Teachers> al = new ArrayList<Teachers>();
		
		al.add(new Teachers(10,"Kiran",37142));
		al.add(new Teachers(9,"Ashwin",30142));
		al.add(new Teachers(10,"Amit",37562));
		al.add(new Teachers(1,"Ashwin",37852));
		al.add(new Teachers(6,"Pooja",54000));
		al.add(new Teachers(8,"Ankitha",60000));
		
		System.out.println("Array List Elements");
		System.out.println(al);
		
		TreeSet<Teachers> ts = new TreeSet<Teachers>(al);
		
		System.out.println("Tree Set Elements :");
		
		System.out.println(ts);
		
		
		
        
	}

}
