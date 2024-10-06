package Day1;

import java.util.Scanner;

public class EvenorOddUsingTernaryOp {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int num = sc.nextInt();
	
		//Syntax  variable = expression1 ? expression2 : expression3
		
		String res = (num%2 == 0) ? "Even Number" : "Odd Number";
		
		System.out.println(res);
		
		
		sc.close();
	}
}
