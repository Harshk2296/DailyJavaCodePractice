package Day1;

import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
		int a, b;
		//int  sum;
		Scanner obj = new Scanner(System.in);
		a = obj.nextInt();
		b=  obj.nextInt();
		// Adding both integers
//		sum = a + b;
//		sum=a-(-b);
//		sum =Integer.sum(a, b);
		while(a>0) {
			b++;
			a--;
		}
		
//		System.out.println("The sum of "+a+ " and "+b+" is "+sum);
		System.out.println(b);
	 obj.close();	
	}
}
