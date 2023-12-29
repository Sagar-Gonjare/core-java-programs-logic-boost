package core_java_programs_logic_boost;

import java.util.Scanner;

public class FactorialOfNumber {
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the non negative number ");
		int num=sc.nextInt();
		System.out.println("factorial of a given number is "+factorial(num));
	}
	public static int factorial(int num) {
		int fact=1;
		for (int i=1 ; i<=num ; i++) {
			
			fact *= i;
		
		}
		return fact;
	}
}
