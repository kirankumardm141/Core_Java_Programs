import java.util.Comparator;
import java.util.TreeSet;


public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		
		TreeSet<Integer> ts = new TreeSet<Integer>
		(new Comparator<Integer>() {

			@Override
			public int compare(Integer i1, Integer i2) {
				// TODO Auto-generated method stub
				return i1<i2?-1:(i1==i2)?0:1;
			}
		}); 
		
		ts.add(50);
		ts.add(70);
		ts.add(45);
		ts.add(25);
		ts.add(90);
		ts.add(34);
		
		System.out.println(ts);
		
		
	}

}
