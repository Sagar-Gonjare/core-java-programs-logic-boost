package core_java_programs_logic_boost;

import java.util.Scanner;

public class CalculateTheAverageOfSetOfNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("for  how many element we have to calculate the  avarage ");
		int n=sc.nextInt();
		
		if (n<=0) {
			System.out.println("Enter valid number");
		}
		int sum=0;
		for (int i=0;i<n;i++) {
			System.out.println("Enter the "+(i+1)+" th element ");
			double element=sc.nextDouble();
			sum+=element;
		}
		double  avg=sum/n;
		System.out.println("Avarage is "+avg);
		
	}
}
