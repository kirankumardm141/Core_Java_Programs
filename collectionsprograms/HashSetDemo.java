package collectionsprograms;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> obj = new HashSet<Integer>();

		for (int i = 4; i <= 40; i = i + 4) {
			obj.add(i);
		}
		
		for (Integer integer : obj) {
			System.out.println(integer+" Hash Code -> "+obj.hashCode());
		}
		
		System.out.println(obj);

		System.out.println("Duplicates are not allowed  i.e 36 is not added to the Hash Set");

		obj.add(36); // Duplicates are not allowed i.e they are not added to the Hash Set
		
		obj.add(44);

		System.out.println(obj);
	}

}
