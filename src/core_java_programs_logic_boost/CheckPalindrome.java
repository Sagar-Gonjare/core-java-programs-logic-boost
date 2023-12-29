package core_java_programs_logic_boost;

import java.util.Scanner;

public class CheckPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the String ");
		String str = sc.nextLine();
		if (checkPalindrome(str)) {
			System.out.println("The string is palindrome");
		}else {
			System.out.println("The String is not Palindrome ");
		}
	}
	
	public static boolean checkPalindrome (String str) {
		//Remove Spaces and Convert to Lowercase:
		str = str.replaceAll("\\s", "").toLowerCase();
		// Reverse the String
		String reverseString = new StringBuilder(str).reverse().toString();
		// check for palindrome
		return str.equals(reverseString);
	}

}
