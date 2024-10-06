package Day1;

public class SwapTwoNumbers2 {
	public static void main(String[] args) {
		int a = 1;
		int b =2;
		
		 System.out.println("_________Before Swaping ________");
			System.out.println("First Element = "+ a);
			System.out.println("Second Element = "+ b);
			
			a = a + b;
			
			b = a - b;
			
			a = a - b;
			

			System.out.println("\n\n________After Swpping_______");
			System.out.println("First Element = "+ a);
			System.out.println("Second Element = "+ b);
	}
}
