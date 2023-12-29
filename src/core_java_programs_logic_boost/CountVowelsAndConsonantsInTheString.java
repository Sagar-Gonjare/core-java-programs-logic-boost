package core_java_programs_logic_boost;

import java.util.Scanner;

public class CountVowelsAndConsonantsInTheString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the String ");
		String str= sc.nextLine().toLowerCase();
		
		System.out.println("Vowel in the string is "+vowelCount(str));
		System.out.println("Consonent in the string is "+consonantsCount(str));

	}

	public static  int vowelCount(String str) {
		int count =0;
		for (int i= 0;i<str.length();i++) {
			char ch = str.charAt(i);
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count ++;
			}
			
		}
		return count;
	}
	public static  int consonantsCount (String str) {
		int count =0;
		for (int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if (Character.isLetter(ch)&&!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')) {
				count ++; 
			}
		}
		return count ;
	}
}
