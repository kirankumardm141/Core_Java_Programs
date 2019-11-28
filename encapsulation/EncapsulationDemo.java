package encapsulation;

public class EncapsulationDemo {

	// Declaring below variables as private so that they can only be accessed in
	// other classes through getter methods this is Encapsulation.

	private int id;
	private String name;
	private String addr;

	public EncapsulationDemo(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationDemo obj = new EncapsulationDemo(1, "Kiran");
		obj.setAddr("Bengaluru");
		int id = obj.getID();
		String name = obj.getName();
		String addr = obj.getAddr();
		System.out.println("ID : " + id + " Name: " + name + " Address: " + addr);
		for (int i = 0; i <= 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("the Value of i : " + i);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
