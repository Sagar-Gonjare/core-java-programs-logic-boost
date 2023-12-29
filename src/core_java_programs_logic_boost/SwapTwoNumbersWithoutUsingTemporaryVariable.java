package core_java_programs_logic_boost;

public class SwapTwoNumbersWithoutUsingTemporaryVariable {
	public static void main(String[] args) {
		int a =10;
		int b = 6;
		System.out.println("Before Swapping the value of a is "+a+" and value of b is "+ b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After  Swapping the value of a is "+a+" and value of b is "+ b);
	}
}
