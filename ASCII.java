package Day1;

import java.util.Scanner;

public class ASCII {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a Character : ");
	
	char letter = s.next().charAt(0);
	 
	int code = letter;
	 System.out.println("ASCII value of "+letter+" is: "+ code );
	
	s.close();
}
}
