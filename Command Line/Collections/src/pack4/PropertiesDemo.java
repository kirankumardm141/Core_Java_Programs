package pack4;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesDemo {
	
	public static void main(String[] args) {
		
		
		try {
			FileInputStream fis = new FileInputStream("db.properties");
			Properties prop = new Properties();
			prop.load(fis);
			
			System.out.println(prop.getProperty("driverURLName"));
			System.out.println(prop.getProperty("username"));
			System.out.println(prop.getProperty("password"));
		
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
	}

}
