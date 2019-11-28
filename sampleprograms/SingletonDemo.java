package sampleprograms;

public class SingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		Singleton instance3 = Singleton.getInstance();
		instance.s=(instance.s).toUpperCase();
		System.out.println("Modified String :"+instance.s);
		System.out.println("Modified String :"+instance2.s);
		System.out.println("Modified String :"+instance3.s);

	}

}
