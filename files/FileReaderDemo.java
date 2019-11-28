package files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = null;
		try {
			fr = new FileReader(new File("D:\\WorkSpace\\Core Java\\abc.txt"));

			while (fr.read() != -1) {
				System.out.print(fr.read() + " ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fr.close();
		}

	}

}
