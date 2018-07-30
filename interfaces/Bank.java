package interfaces;

interface Bank {
	// By default public static will be added
	int acNo=1000; 
	// By default public abstract
	void withdrawal();
	void balance();
	void balanceEnquiry();
	void miniStatement();
}
