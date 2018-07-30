package behaviours;

class A{
	final double PI=3.142;
	static int x=10;
	final void m1() {
		System.out.println("Final Methods cannot be Overridden but are inherited to the derived class");
	}
	static void m2() {
		System.out.println("Static Methods can be called directly using class name");
	}
	
}
final class B extends A{
	
	public void m3() {
		System.out.println("Final Class B cannot be inherited");
	}
}

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		System.out.println("Static Variable x : "+A.x+" Final Variable PI : "+obj.PI);
		B obj1 = new B();
		obj1.m1();
		A.m2();
		obj1.m3();
	}

}
