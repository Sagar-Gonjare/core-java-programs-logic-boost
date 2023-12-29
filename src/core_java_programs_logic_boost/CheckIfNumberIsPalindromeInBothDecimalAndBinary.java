package core_java_programs_logic_boost;

import java.util.Scanner;

public class CheckIfNumberIsPalindromeInBothDecimalAndBinary {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the number ");
		int num= sc.nextInt();
		if (isPalindromeForBinary(num)) {
			System.out.println("true");
		}
		if (isPalindromeForDecimal(num)&&isPalindromeForBinary(num)) {
			System.out.println("the given Number is Palindrome in Both Decimal and Binary.");
		}else {
			System.out.println("the given number is not Palindrome in Both Decimal and Binary.");
		}
	}
	
	public static boolean isPalindromeForDecimal(int num) {
		int originalNum= num;
		int reverse = 0;
		while(num>0) {
			int digit =num%10;
			reverse=reverse*10+digit;
			num/=10;
		}
		return originalNum==reverse;
	}


	
	private static boolean isPalindromeForBinary(int decimalNumber) {
        String binaryString = Integer.toBinaryString(decimalNumber);
        String reversedBinaryString = new StringBuilder(binaryString).reverse().toString();

        return binaryString.equals(reversedBinaryString);
    }
}
