package core_java_programs_logic_boost;

import java.util.Scanner;

public class CalculateTHeSumOfDigitsInNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		System.out.println("Sum of the digis is "+ sumOfDigits(num));
		
	}
	public static int sumOfDigits(int num) {
		int sum=0;
		while (num!=0) {
			int digit=num%10;
			sum+=digit;
			num/=10;
		}
		return sum;
	}
}
