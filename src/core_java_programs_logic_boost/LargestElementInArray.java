package core_java_programs_logic_boost;

public class LargestElementInArray {
	
	public static void main(String[] args) {
		int num[]= {3,1,43,21,55,553,12,1112,21242,121,45};
		System.out.println("Largest element in the array is " +largestFromArray(num));
	}
	public static int largestFromArray(int num[]) {
		int largest=Integer.MIN_VALUE;
		for (int i=0;i<num.length;i++) {
			if (largest<num[i]) {
				largest=num[i];
			}
		}
		return largest;
		
	}
}