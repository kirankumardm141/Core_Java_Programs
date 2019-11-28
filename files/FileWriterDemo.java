package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException, NullPointerException {
		// TODO Auto-generated method stub
		FileWriter fw = null;
		fw = new FileWriter(new File("abc.txt"));
		for (int i = 65; i <= 90; i++) {
			fw.write(i);
		}
		fw.append("\n");
		for (Integer i = 96; i <= 121; i++) {
			fw.append(i.toString());
		}
		fw.append("\n");
		for (int i = 97; i <= 122; i++) {
			fw.write(i);
		}

		// Write the content from object to File abc.txt
		//fw.flush();

		fw.close();
	}

}
