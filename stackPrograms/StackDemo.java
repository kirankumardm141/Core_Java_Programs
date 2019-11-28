package stackPrograms;

import java.util.Scanner;

public class StackDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Size of stack:");
		int n = scanner.nextInt();
		Stack s = new Stack(n);
		int item;
		while (true) {
			System.out.println("Enter your choice");
			System.out.println("1.Push\n2.Pop\n3.Display");
			int ch = scanner.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter the element to be inserted");
				item = scanner.nextInt();
				s.push(item);
				break;
			case 2:
				item = s.pop();
				if (item != 0)
					System.out.println("Popped element is " + item);
				break;
			case 3:
				s.show();
				break;
			default:
				System.exit(0);
			}
		}
	}
}
