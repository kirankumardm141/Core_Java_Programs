package mapprograms;

import java.io.FileInputStream;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try 
		{
			FileInputStream fis = new FileInputStream("connection.properties");
			Properties prop = new Properties();
			prop.load(fis);
			
			System.out.println(prop.getProperty("driverName"));
			System.out.println(prop.getProperty("url"));
			System.out.println(prop.getProperty("userName"));
			System.out.println(prop.getProperty("passWord"));
			
			Enumeration<Object> ele = prop.elements();
			
			System.out.println("Using Enumerator :");
			while(ele.hasMoreElements())
			{
				System.out.println(ele.nextElement());
			}
			
			
		} 
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
