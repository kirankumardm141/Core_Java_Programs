package sampleprograms;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int a=0,b=1,c;
		System.out.print(a+" "+b);
		for(int i=0;i<length;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}

	}

}