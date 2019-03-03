package sampleprograms;

public class MethodtoString {
	
//	@Override
//	public String toString() {
//		return "MethodtoString [name=" + name + ", salary=" + salary + "]";
//	}

	String name;
	double salary;
	
	public MethodtoString(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
	
	
	
}
