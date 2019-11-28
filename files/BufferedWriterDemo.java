package files;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("123.txt"));
			for (int i = 65; i <= 90; i++) {
				bw.write(i);
			}
			bw.flush();
			//bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
