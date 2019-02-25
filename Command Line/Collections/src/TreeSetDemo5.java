import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;


public class TreeSetDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TreeSet<Integer> ts = new TreeSet<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});
		ts.add(50);
		ts.add(45);
		ts.add(23);
		ts.add(78);
		ts.add(56);
		System.out.println(ts);
		
		

	}

}
