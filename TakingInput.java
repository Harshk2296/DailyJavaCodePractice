package Day1;

import java.util.Scanner;

public class TakingInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char c ;
		int v_int;
		float v_folat;
		String str;
		
		Scanner scanner;
		scanner = new Scanner(System.in);
		
		// Taking input from user
		
		System.out.println("Enter a String ");
		str = scanner.nextLine();
		
		System.out.println("Enter a Character ");
		c = scanner.next().charAt(0);
		
		System.out.println("Enter a Integer ");
		v_int = scanner.nextInt();		
		
		System.out.println("Enter A Float");
		v_folat = scanner.nextFloat();
		
		// Printing Data entered by user
		System.out.println("You entered Following data :");
		System.out.printf("String :%s\n",str);
		System.out.printf("Character : %c\n",c);
		System.out.printf("Integer : %d\n",v_int);
		System.out.printf("Flaot : %f\n",v_folat);
		scanner.close();
		
	}
}
