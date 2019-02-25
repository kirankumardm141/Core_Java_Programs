package flow;
public class ProgramFlow{
	private int a=10;
	static int b=20;
	
	ProgramFlow()
	{
		System.out.println("I am Default Constructor");
	}
	
	static{
		System.out.println("I am from static method");
	}
	
	public void InstanceMethod()
	{
		System.out.println("I am from Instance Method");
	}
	
	public static void StaticMethod()
	{
		System.out.println("I am from Static Method");
	}
	
	public static void main(String[] args)
	{
		ProgramFlow pf = new ProgramFlow();
		pf.InstanceMethod();
		ProgramFlow.StaticMethod();
		System.out.println("Instance Variable a: "+ pf.a+" "+"Static Variable b: "+ProgramFlow.b);
		
	}
}