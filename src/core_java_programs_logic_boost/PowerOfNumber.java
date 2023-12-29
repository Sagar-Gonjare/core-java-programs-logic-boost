package core_java_programs_logic_boost;

import java.util.Scanner;

public class PowerOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter base number ");
		int base = sc.nextInt();
		System.out.println("Enter power of a number "+ base );
		int power=sc.nextInt();
		int ans=(int) Math.pow(base, power );
		System.out.println("Ans is "+ ans);
		
	}

}
