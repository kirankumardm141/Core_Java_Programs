package methodoverloading;

public class Bus {

	private String busno;
	private String name;
	private String bustype;
	private int capacity;
	private String source;
	private String dest;
	private double price;
	public Bus(String busno, String name, String bustype, int capacity, String source, String dest, double price) {
		super();
		this.busno = busno;
		this.name = name;
		this.bustype = bustype;
		this.capacity = capacity;
		this.source = source;
		this.dest = dest;
		this.price = price;
	}
	public String getbusno() {
		return busno;
	}
	public String getName() {
		return name;
	}
	public String getBustype() {
		return bustype;
	}
	public int getCapacity() {
		return capacity;
	}
	public String getSource() {
		return source;
	}
	public String getDest() {
		return dest;
	}
	public double getPrice() {
		return price;
	}
	
}
