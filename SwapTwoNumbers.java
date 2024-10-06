package Day1;

import java.util.Scanner;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		
	
	int a,b;
	Scanner s = new Scanner(System.in);
	 System.out.println("Enter First Number");
	a= s.nextInt();
	
	System.out.println("Enter Second Number");
	b=s.nextInt();
	
 System.out.println("_________Before Swaping ________");
	System.out.println("First Element = "+ a);
	System.out.println("Second Element = "+ b);
	
	
	int temp = a;
	
	a=b;
	
	b=temp;
	
	System.out.println("\n\n________After Swpping_______");
	System.out.println("First Element = "+ a);
	System.out.println("Second Element = "+ b);
	
	s.close();
	}	
}
