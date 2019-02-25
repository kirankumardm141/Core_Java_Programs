package pack2;

public class Employee implements Comparable<Employee>{
	
	private int empId;
	private String empName;
	private double sal;
	
	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public double getSal() {
		return sal;
	}

	public Employee(int empId, String empName, double sal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
	}

	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		Double d1 = emp.getSal();
		Double d2 = this.getSal();
		return d1.compareTo(d2);
		//return d1<d2?1:d1==d2?0:-1;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", sal="
				+ sal + "]";
	}
	
	
	

}
