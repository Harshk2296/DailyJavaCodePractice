package Day1;

import java.util.Scanner;

public class EvenOdd2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int num = sc.nextInt();
	
		if((num/2) * 2 == num) {
			System.out.println("Even Number");
		}else {
			System.out.println("Odd Number");
		}
		
		sc.close();
	
	
	}
}
