import java.util.ArrayList;


public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println(al.size());
		
		al.add(10);
		System.out.println(al.size());
		for (int i = 20; i <=110; i=i+10) {
			al.add(i);
		}
		System.out.println(al);
		al.add(120);
		al.add(120);
		al.add(120);
		al.add(120);
		al.add(120);
		System.out.println(al);
		System.out.println(al.contains(900));
		al.add(0, 999);
		System.out.println(al);
		
		if(!al.isEmpty())
			al.remove(new Integer(120));
		
		System.out.println(al);
		
		System.out.println(al.get(0));
		
		
		for(int i=0;i<al.size();i++)
			System.out.print(al.get(i)+" ");
		System.out.println("=============");
		
		for (Integer integer : al) {
			System.out.print(integer+" ");
		}
		
	
		
		
	
	}

}
