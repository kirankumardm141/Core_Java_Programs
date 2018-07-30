package inheritance;

public class superclass {
	int a;
	int b;
	superclass(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println("I am super class constructor");
	}
	public superclass() {
		// TODO Auto-generated constructor stub
		System.out.println("I am super class default constructor");
	}
	public void m1() {
		System.out.println("I am super class method");
	}

}
