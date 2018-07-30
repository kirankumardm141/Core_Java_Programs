package collectionsprograms;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparatorDemoHackers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TreeSet<Hackers> ts = new TreeSet<Hackers>(new HackersComparator());
		
		
		//Anonymous Inner Type Comparator
		/*TreeSet<Hackers> ts = new TreeSet<Hackers>(new Comparator<Hackers>() {

			@Override
			public int compare(Hackers o1, Hackers o2) {
				// TODO Auto-generated method stub
				
				Integer i1 = o1.getId();
				Integer i2 = o2.getId();
				
				return i1<i2?-1:i1>i2?1:0;
			}
		});*/

		ts.add(new Hackers(420, "Kiran", 80000));
		ts.add(new Hackers(460, "Biplav", 90000));
		ts.add(new Hackers(450, "Vinay", 2000));
		ts.add(new Hackers(300, "Mardi", 10000));
		ts.add(new Hackers(250, "Tarun", 20000));
		ts.add(new Hackers(850, "Priya", 60000));

		System.out.println(ts);
	}

}

class HackersComparator implements Comparator<Hackers>
{

	@Override
	public int compare(Hackers o1, Hackers o2) {
		// TODO Auto-generated method stub
		Integer i1 = o1.getId();
		Integer i2 = o2.getId();
		
		return i1<i2?-1:i1>i2?1:0;
	}
	
}
