package core_java_programs_logic_boost;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {
	public static void main(String[] args) {
		int num[]= {1,2,2,4,2,6,7,3,4,4,3,8,9,8};
		int unique[]=removeDuplicates(num);
		System.out.println(Arrays.toString(unique));
		
	}
	public static int[] removeDuplicates(int num []) {
		// sort the array to duplicate together 
		Arrays.sort(num);
		
		// count the unique elements
		int unique=1;
		for (int i=1;i<num.length;i++) {
			if (num[i]!=num[i-1]) {
				unique++;
			}
		}
		// to create new array 
		int uniqueArray[]=new int [unique];
		uniqueArray[0]=num[0];
		int index=1;
		for (int i=1;i<num.length;i++) {
			if (num[i]!=num[i-1]) {
				uniqueArray[index++]=num[i];
			}
		}
		return uniqueArray;
	}
	 

}
