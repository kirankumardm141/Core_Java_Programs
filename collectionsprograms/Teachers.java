package collectionsprograms;

public class Teachers implements Comparable<Teachers>{
	
	private int id;
	private String name;
	private double salary;
	
	
	//Parameterized Constructors
	public Teachers(int Id,String Name,double Salary)
	{
		this.id=Id;
		this.name= Name;
		this.salary=Salary;
	}
	
	
	//Getter Methods
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
		return "Teachers [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}


	@Override
	public int compareTo(Teachers o) {
		// TODO Auto-generated method stub
		
		String s1= this.name;
		String s2= o.getName();
		return s1.compareTo(s2);
	}

	
	

}
