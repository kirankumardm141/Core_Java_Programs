package interfaces;

public class HDFC implements Bank {
	
	@Override
	public void withdrawal()
	{
		System.out.println("HDFC Withdrawal");
	}
	
	public void balance() {
		System.out.println("HDFC Balance");
	}
	
	public void balanceEnquiry() {
		System.out.println("HDFC Balance Enquiry");
	}
	
	public void miniStatement() {
		System.out.println("HDFC miniStatement");
	}

}
