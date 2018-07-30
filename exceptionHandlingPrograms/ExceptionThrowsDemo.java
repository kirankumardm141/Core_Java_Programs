package exceptionHandlingPrograms;

public class ExceptionThrowsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		for (int i = 3; i <= 30; i = i + 3) {
			System.out.println("The Value of i :" + i);
			Thread.sleep(1000);
		}

	}

}
