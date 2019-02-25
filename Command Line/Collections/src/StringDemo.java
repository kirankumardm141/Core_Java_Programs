public class StringDemo {

	public static void main(String[] args) {

		StringBuffer sbuffer = new StringBuffer();
		long startTime = System.currentTimeMillis();
		for (int i = 0; i <= 100000; i++) {
			sbuffer.append("hello");
		}
		System.out.println("time taken to process SBuffer is"
				+ (System.currentTimeMillis() - startTime));

		StringBuilder sbuilder = new StringBuilder();
		long startTime2 = System.currentTimeMillis();
		for (int i = 0; i <= 100000; i++) {
			sbuilder.append("hello");
		}
		System.out.println("time taken for sbuider is "
				+ (System.currentTimeMillis() - startTime2));

	}

}
