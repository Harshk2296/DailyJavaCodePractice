package Day1;

public class recursion {

	public static int addNums(int num1, int num2) {
		if (num1 > 0)
			return num2;
		else
			return addNums((num1 & num2) << 1, num1 ^ num2);
	}

	public static void main(String[] args) {
		int  a=10, b =15;
		System.out.println("The sum of "+a+" and "+b+" is = "+addNums(a, b));
		

	}
}
