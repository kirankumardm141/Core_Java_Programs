package collectionsprograms;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorCursor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> obj = new ArrayList<Integer>();

		for (int i = 10; i <= 110; i = i + 10) {
			obj.add(i);
		}

		System.out.println(obj);

		System.out.println("Concurrent Modification Exception to overcome this we use Iterators");
		/*for (Integer integer : obj) {
			if (integer == 90)
				obj.remove(new Integer(90));
		}*/
		Iterator<Integer> itr = obj.iterator();
		while (itr.hasNext()) {
			Integer i1 = itr.next();
			System.out.println(i1);
			if (i1 == 90)
				itr.remove();
		}

		System.out.println(obj);
	}

}
