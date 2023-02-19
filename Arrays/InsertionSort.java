package Arrays;

import java.util.Arrays;

public class InsertionSort {
	
	public static void unsortedLastElement(int arr[]) {
		
		int temp = arr[arr.length-1];
		int i = arr.length-2;
		while( i >= 0) {
			if(arr[i] > temp) arr[i+1] = arr[i];
			else break;
			i--;
		}
		arr[i+1] = temp;
		
	}
	
	
	public static void unsortedLastElement2(int arr[], int ele) {
		
		int temp = arr[ele];
		int i = ele - 1;
		while( i >= 0) {
			if(arr[i] > temp) arr[i+1] = arr[i];
			else break;
			i--;
		}
		arr[i+1] = temp;
		
	}
	
	
	public static void insertionSort(int arr[]) {
		
		for(int i=1; i<arr.length; i++) {
			unsortedLastElement2(arr, i);
			System.out.println(Arrays.toString(arr));
		}	
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,2,9,6,0,6,4,5};
		System.out.println(Arrays.toString(arr));
		
		insertionSort(arr);
		//System.out.println(Arrays.toString(arr));

	}

}
