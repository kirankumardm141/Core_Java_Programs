package labPrograms;

import java.util.Scanner;

//A simple text scanner which can parse primitive types and strings using regular expressions
public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		String usn;
		String name;
		String branch;
		String phoneNumber;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Number of Students:");

		int n = scanner.nextInt();

		Student[] students = new Student[n];

		System.out.println("Enter student details");

		for (i = 0; i < n; i++) {
			System.out.println("Enter Student " + (i + 1) + " Details\n");
			System.out.println("Enter Student USN");
			usn = scanner.next();
		 
			System.out.println("Enter Student NAME");
			name = scanner.next();
			System.out.println("Enter Student BRANCH");
			branch = scanner.next();
			System.out.println("Enter Student PHONE NUMBER");
			phoneNumber = scanner.next();
			students[i] = new Student(usn, name, branch, phoneNumber);
		}

		System.out.println("USN" + "\t" + "NAME" + "\t" + "BRANCH" + "\t" + "PHONENUMBER");
		for (i = 0; i < n; i++) {
			System.out.println(students[i]);
		}
		scanner.close();
	}
}
