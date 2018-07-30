package methodoverriding;

public class SubClass extends SuperClass {
	
	// Method Overriding
	// Overriding operate method from SuperClass

	
	@Override
	public int operate(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Multiplication of two numbers");
		return a*b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubClass obj = new SubClass();
		System.out.println(obj);
		int x=obj.operate(10, 20);
		System.out.println(x);
		SuperClass obj1 = new SuperClass();
		int y=obj1.operate(10, 20);
		System.out.println(y);
		
		//Creating Parent Reference
		SuperClass obj2 = new SubClass();
		int z=obj2.operate(5, 10);
		System.out.println(z);
	}


}
