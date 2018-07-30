package collectionsprograms;

public class Hackers {

	private int id;
	private String name;
	private double salary;

	public Hackers(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// Getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Hackers [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
