package Day1;

import java.util.Scanner;

public class ComputeQuitientandRemainder {
  
	public static void main(String[] args) {
		int dvnd, dvsr;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter :");
		dvnd = sc.nextInt();
		dvsr = sc.nextInt();
	    int qout =  dvnd / dvsr;
	    
	    int rem = dvnd % dvsr;
	    
	    System.out.println("Quotient = " + qout);
	    System.out.println("Remainder = " + rem);
	    
	    sc.close();
	    
	}
}
