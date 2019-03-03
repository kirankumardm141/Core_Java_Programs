package labPrograms;

public class Student {

	private String usn; // data members
	private String name;
	private String branch;
	private String phoneNumber;

	public Student(String usn, String name, String branch, String phoneNumber) {
		// parameterised constructor
		this.usn = usn;
		this.name = name;
		this.branch = branch;
		this.phoneNumber = phoneNumber;
	}

	public String toString() // represents object as a string
	{ // method returns the string representation of the object.
		return usn + " \t" + name + "\t " + branch + "\t " + phoneNumber;
	}

}
