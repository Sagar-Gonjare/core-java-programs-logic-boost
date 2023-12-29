package core_java_programs_logic_boost;

import java.util.Scanner;

public class CheckLeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the valid year ");
		int n = sc.nextInt();
		if (n%4==0) {
			System.out.println("Given year is leap year");
		}else {
			System.out.println("Given year is not leap year ");
		}
	}
}
