package abstraction;

abstract class Bank {
	abstract int getROI();
}

class SBI extends Bank {

	public int getROI() {
		return 8;
	}
}

class HDFC extends Bank {
	public int getROI() {
		return 6;
	}
}

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating Parent Reference
		Bank obj = new SBI();
		System.out.println("SBI's Rate of Interest : " + obj.getROI());
		Bank obj1 = new HDFC();
		System.out.println("HDFC's Rate of Interest : " + obj1.getROI());

	}

}
