package datedemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date obj = new Date();
		System.out.println(obj);
		SimpleDateFormat obj1 = new SimpleDateFormat("dd-MM-yyyy");
		String td=obj1.format(obj);
		System.out.println(td);

	}

}
