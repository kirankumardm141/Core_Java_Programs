package exceptionHandlingPrograms;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			for (int i = 10; i <= 100; i = i + 10) {
				System.out.println("The Value if i :" + i);
				Thread.sleep(1000);
				Thread.currentThread().interrupt();
				System.out.println("Boolean Value :"+Thread.interrupted());
			}
		} 
		catch(InterruptedException s)
		{
			s.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
