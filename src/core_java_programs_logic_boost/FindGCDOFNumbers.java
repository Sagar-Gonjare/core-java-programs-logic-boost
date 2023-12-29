package core_java_programs_logic_boost;

import java.util.Scanner;

public class FindGCDOFNumbers {
	public static int findGCD(int a, int b) {
		if (b>a) {
			int temp = b;
			b=a;
			a=temp;
			
		}
		// using euclidian algorithm
		while (b!=0) {
			int remainder = a%b;
			a=b;
			b=remainder;
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter first number ");
		int a= sc.nextInt();
		System.out.println("Enter second number ");
		int b=sc.nextInt();
		System.out.println("GCD of the number "+a+" and  " +b +" is "+findGCD(a,b));
				
	}

}
