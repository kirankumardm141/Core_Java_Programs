package pack3;

public class Student {
	
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", marks="
				+ marks + "]";
	}


	private int stuId;
	private String stuName;
	private double marks;
	
	
	public Student(int stuId, String stuName, double marks) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.marks = marks;
	}


	public int getStuId() {
		return stuId;
	}


	public String getStuName() {
		return stuName;
	}


	public double getMarks() {
		return marks;
	}
	
	
	
	
	

}
