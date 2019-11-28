package sampleprograms;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Value of First Variable "+a+" Value of Second Variable "+b);
		a =a+b;
		b= a-b;
		a= a-b;
		System.out.println("Value of First Variable "+a+" Value of Second Variable "+b);

	}

}
