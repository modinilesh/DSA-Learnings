package SortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {
	
	public static void insertionSort(int arr[]) {
		
		for(int i=1; i<arr.length; i++) {
			
			int temp = arr[i];
			int j = i-1;
			while(j >= 0) {
				if(arr[j] > temp) {
					arr[j+1] = arr[j];
					j--;
				}
				else break;
				
			}
			arr[j+1] = temp;
			//System.out.println(Arrays.toString(arr));
			
		}
		System.out.println(Arrays.toString(arr));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {4,3,1,2,4,5,6,9,7,8} ;
		System.out.println(Arrays.toString(arr));
		
		insertionSort(arr);
	}

}
