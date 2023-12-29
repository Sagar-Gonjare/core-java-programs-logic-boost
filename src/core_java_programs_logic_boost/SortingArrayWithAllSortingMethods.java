package core_java_programs_logic_boost;

import java.util.Arrays;

public class SortingArrayWithAllSortingMethods {
	public static void main(String[] args) {
		int num[]= {12,1,143,7,34};
		bubbleSort(num);
		inBuiltSort ();
		insertionSort(num);
		
		
	}
	// bubble sort 
	public static void  bubbleSort(int num[]) {
		for (int turn =0;turn<num.length;turn++) {
			for (int j=0;j<num.length-1;j++) {
				if(num[j]>num[j+1]) {
					int temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
					
				}
			}
		}
		System.out.println("Bubble Sort ");
		for(int i=0;i<num.length;i++) {
			System.out.print(+num[i]+" ");
		}
	}
	// inbuilt sort
	public static void inBuiltSort () {
		int num[]= {12,1,143,7,34};
		Arrays.sort(num);
		System.out.println("\n\nInbuilt sort ");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
	}
	
	// insertion sort 
	
	public static void insertionSort(int arr[]) {
		System.out.println("\n\nInsertion Sort ");
		for (int i =1;i<arr.length;i++) {
			int current=arr[i];
			int prev=i-1;
			while(prev>=0 && arr[prev]>current ){
				arr[prev+1]=arr[prev];
				prev--;
			}
			arr[prev+1]=current;
		}
		for (int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
