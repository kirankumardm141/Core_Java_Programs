package testaccessmodifiers;

import accessmodifiers.Test;

class demo extends Test{
	
	public static void m2() {
		demo obj =new demo();
		System.out.println("Public Modifier "+obj.a+" Protected Modifier "+obj.b+" Default Modifier cannot be accessed ! "+"Private Modifier cannot be accessed!");
	}
}
public class parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test obj = new Test();
		System.out.println("Public Modifier "+obj.a+" Protected Modifier cannot be accessed !"+" Default Modifier cannot be accessed ! "+"Private Modifier cannot be accessed!");
		demo.m2();
		
	}

}
