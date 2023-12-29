package core_java_programs_logic_boost;

public class FindTheSecondLargestElementInArray {
	
	public static void main(String[] args) {
		int num[]= {10,11,1,15,22};
		System.out.println("Second lagest from array is "+secondLargest(num));
	}
	
	public static int secondLargest(int num[]) {
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		for ( int i =0;i<num.length;i++) {
			if (num[i]>largest) {
				secondLargest=largest;
				largest=num[i];
			}
		}
		return secondLargest;
	}

}
