package methodoverriding;

public class SuperClass {
	
	public int operate(int a ,int b)
	{
		System.out.println("Addition of two numbers");
		return a+b;
	}
	
	public String toString()
	{
		System.out.println("Overriding tostring method from object class");
		return "Kiran";
	}
}
