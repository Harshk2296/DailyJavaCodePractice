package Day1;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number: ");

		int num = s.nextInt();
		 
		int rem= num % 2;
		
		if (rem == 0) {
			System.out.println("Even number");
		}else {
			System.out.println("Odd numbers");
		}
		
		
		s.close();
	}

}
