package files;

import java.io.FileReader;

public class FileNotFoundExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null;
		try 
		{
			System.out.print("File Not Found Exception Demo -> ");
			fr = new FileReader("abc.txt");
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		} 
		finally 
		{
			try
			{
				fr.close();
			} 
			catch (Exception e) 
			{
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
