package sampleprograms;

import java.util.Scanner;

public class StringPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char c[] = s.toCharArray();
		String s1= "";
        for(int i=c.length-1;i>=0;i--)
        {
        	s1 = s1 + c[i];
        }
        if(s.equals(s1))
        {
        	System.out.println("String is Pallindrome !");
        }
        else
        {
        	System.out.println("String is not pallndrome !");
        }
	}

}
