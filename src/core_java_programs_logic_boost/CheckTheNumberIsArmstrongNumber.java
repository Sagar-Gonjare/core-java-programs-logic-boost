package core_java_programs_logic_boost;

import java.util.Scanner;

public class CheckTheNumberIsArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the number ");
		int number = sc.nextInt();
		
		if (isArmstrongNumber(number)) {
			System.out.println("Number is Armstrong ");
		}else {
			System.out.println("Number is not An Armstrong number ");
		}
		
	}
	public static boolean isArmstrongNumber(int num) {
		int originaNumber=num;
		int digCount= countDigit(num);
		int sum=0;
		
		while(num!=0) {
			int digit = num%10;
			sum+=Math.pow(digit, digCount);
			num/=10;
		}
		return sum==originaNumber;
	}
	
	public static int countDigit(int num) {
		int count =0;
		while (num!=0) {
			num/=10;
			count ++;
		}
		return count;
	}
}
