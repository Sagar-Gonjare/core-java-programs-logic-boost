package core_java_programs_logic_boost;

import java.util.Scanner;

public class CheckTheNumberIsPrime {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number ");
		int number = sc.nextInt();
		if (isPrime(number)) {
			System.out.println("Number is prime");
		}else {
			System.out.println("Number is not prime ");
		}
	}
	
	public static boolean isPrime(int number) {
		if (number<=1) {
			return false;
		}
		for (int i =2;i<=Math.sqrt(number);i++) {
			if (number%i==0) {
				return false;
			}
		}
		return true;
	}
	

}
