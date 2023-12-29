package core_java_programs_logic_boost;

import java.util.Scanner;

public class GenerateFibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the non negative number upto which you want fibonacci series ");
		int number=sc.nextInt();
		fibonacci(number);
	}
	
	public static void fibonacci(int number) {
		int firstTerm=0,secondTerm=1;
		
		for (int i=0; i<=number ; i++ ) {
			System.out.println(firstTerm);
			int nextTerm = firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=nextTerm;
		}
		
	}
}
