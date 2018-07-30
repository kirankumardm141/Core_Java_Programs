package exceptionHandlingPrograms;

public class MultipleExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		
			/*int a=10,b=0;
			System.out.println("a.b :"+a/b);*/
			/*String s= null;
			s.length();*/
			/*int arr[]= new int[2];
			System.out.println(arr[2]);*/
			String s="k";
			Integer.parseInt(s);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
