package Arrays;

import java.util.Arrays;

public class SelectionSort {
	//In Selection sort we play with indices first then we swap
	
	//Finding minimum Index
	public static int min_index(int arr[], int i) {
		int minI = i;
		
		for(int j=i+1; j<arr.length; j++) {
			if(arr[j] < arr[minI]) minI = j;
		}
		
		return minI;
	}
	
	//Swapping the values in array
	public static void swap(int arr[], int i, int minI) {
		int temp = arr[i];
		arr[i] = arr[minI];
		arr[minI] = temp;
	}
	
	
	//Sorting function
	public static void selectionSort(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			int min = min_index(arr,i);
			swap(arr, i, min);
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
	//Main function
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {30,50,40,20,10,6,2,8,6,5,9,0,2,3} ;
		System.out.println(Arrays.toString(arr));
		
//		selectionSort(arr);
		selectionSort2(arr);
		System.out.println(Arrays.toString(arr));


	}
	
	//All code in one function ie. Selection sort 2
	public static void selectionSort2(int arr[]) {
		
		for(int i=0; i<arr.length-1; i++) {
			int min = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[min] > arr[j]) min = j;
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}

}
