package core_java_programs_logic_boost;

public class FindTheSmallestElementInArray {
	public static void main(String[] args) {
		int num[]= {10,12,21,211,122,6};
		System.out.println("Smallest element in array is  "+ smallestNum(num));
	}
	public static int smallestNum(int num[]) {
		int min=Integer.MAX_VALUE;
		for (int i=0;i<num.length;i++) {
			if (min>num[i]) {
				min=num[i];
			}
		}
		return min;
	}
}
