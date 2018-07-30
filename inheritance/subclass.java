package inheritance;

public class subclass extends superclass {
	int c;
	public subclass(int a,int b,int c) {
		// TODO Auto-generated constructor stub
		//super(50,60);
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.println("I am subclass constructor");
	}
	public void m2() {
		System.out.println("I am from subclass method");
	}
	public static void main(String[] args)
	{
		subclass obj= new subclass(11,12,13);
		System.out.println("a :"+obj.a +" "+"b :"+obj.b+" "+"c :"+obj.c);
		obj.m1();
		obj.m2();
	}

}