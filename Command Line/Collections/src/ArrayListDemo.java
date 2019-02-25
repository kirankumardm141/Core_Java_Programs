import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<String>();
		list.add("data1");
		list.add("data1");
		list.add("data1");
		list.add("data1");
		list.add("data1");
		list.add("data1");
		list.add("data1");
		list.add("data1");
		list.add("data1");
		list.add("data1");
		
		System.out.println(list.size());
		list.add("data1");
		System.out.println(list.size());
		
		
		System.out.println(list.size());
		list.add("data1");
		list.add("data1");
		list.add("data1");
		list.add("data1");
		System.out.println(list.size());
		list.add("data1");
		System.out.println(list.size());
		/*list.add("hello");
		list.add("Abhi");
		list.add("Bharath");
		list.add("venkat");
		System.out.println(list);
		
		list.add(1, "arun");
		System.out.println(list);
		if(list.contains("arun1"))
			System.out.println("success");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("==========================");
		for (String string : list) {
			System.out.println(string);
		}
		
		System.out.println("===========using iterator=================");
		
		Iterator<String> itrlist = list.iterator();
		System.out.println(itrlist.getClass());
		while (itrlist.hasNext()) {
			//System.out.println(itrlist.next());
			if(itrlist.next().equals("arun"))
				itrlist.remove();
		}
		System.out.println(list);*/
		
	}

}
