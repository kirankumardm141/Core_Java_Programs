package sampleprograms;

public class stringdemo {
	
	private static String s="kiran,amit,ashwin";
	private static String s1="kiran,ankitha,amit";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(s);
		System.out.println(s1);
		String[] strsplit=s.split(",");
		String[] strsplit1=s1.split(",");
		for (String string : strsplit) {
			for (String string1 : strsplit1) {
				if(string.compareTo(string1)==0)
					System.out.println(string);
					
			}
			
		}

	}

}
