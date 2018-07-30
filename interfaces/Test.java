package interfaces;

public class Test {

	public static void main(String[] args) {
		
		//Interface reference
		Bank b= new SBI();
		System.out.println("SBI implemented methods");
		b.balance();
		b.balanceEnquiry();
		b.withdrawal();
		b.miniStatement();
		System.out.println("HDFC implemented methods");
		Bank b1=new HDFC();
		b1.balance();
		b1.balanceEnquiry();
		b1.withdrawal();
		b1.miniStatement();
	}
}
