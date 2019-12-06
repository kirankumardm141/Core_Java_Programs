package sampleprograms;

import java.util.HashMap;
import java.util.Map;

public class HashMapImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Hacker,String> hm = new HashMap<>();
		hm.put(new Hacker(1,"Kiran"), "Software Engineer");
		hm.put(new Hacker(2,"Praveen"), "IAS officer");
		for(Map.Entry<Hacker,String> entry : hm.entrySet())
		{
			System.out.println("Key Value"+ entry.getKey()+"Value"+entry.getValue());
		}

	}

}
