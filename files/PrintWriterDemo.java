package files;

import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileWriter("456.txt"));
			
			
			for(int i=97;i<=122;i++)
			{
				pw.write(i);
			}
			//pw.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pw.close();
		}

	}

}
