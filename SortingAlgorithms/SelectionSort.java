package SortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
	
	public static void selectionSort(int[] arr) {
		
		for(int i=0; i<arr.length-1; i++) {
			int min = i;
			
			for(int j=i+1; j<arr.length; j++ ) {
				if(arr[j] < arr[min]) min = j;
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {4,3,1,2,4,5,6,9,7,8} ;
		System.out.println(Arrays.toString(arr));
		
		selectionSort(arr);

	}

}
