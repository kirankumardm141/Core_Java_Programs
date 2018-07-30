package accessmodifiers;

public class Test {
	
	public int a=10;
	protected int b=20;
    int c=30;
	private int d=40;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method");
		
		Test obj = new Test();
		
		System.out.println("Public Modifier "+obj.a+" Protected Modifier "+obj.b+" Default Modifier "+obj.c+" Private Modifier "+obj.d);

		subclass.m1();
	}

}

class subclass extends Test{
	
	public static void m1() {
		subclass obj = new subclass();
		System.out.println("Public Modifier "+obj.a+" Protected Modifier "+obj.b+" Default Modifier "+obj.c+" Private Modifier cannot be accessed!");
	}
}
