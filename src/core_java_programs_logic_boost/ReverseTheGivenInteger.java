package core_java_programs_logic_boost;

import java.util.Scanner;

public class ReverseTheGivenInteger {
	public static void main(String[] args) {
		System.out.println("Enter the number ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Original Integer is "+ num);
		System.out.println("Reversed Integer is "+reverse(num));
	}
	public static int reverse(int number) {
		int reversedNumber=0;
		while (number!=0) {
			int digit=number%10;
			reversedNumber=reversedNumber*10+digit;
			number/=10;
			
		}
		return reversedNumber;
	}
}
