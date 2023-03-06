package SortingAlgorithms;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
	
	public static int partition(int[] arr, int si, int ei) {
		
//		int pivot = arr[ei];
		Random r = new Random(); 
		int p = r.nextInt(ei - si + 1) + si ;
		int temp = arr[p];
		arr[p] = arr[ei];
		arr[ei] = temp;
		
		int pivot = arr[ei];
		int i = si;
		int j = si;
		
		while(i <= ei) {
			
			if(arr[i] <= pivot) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j++;
			}
			else {
				i++;
			}
			//System.out.println(Arrays.toString(arr));
		}
		return j-1;
	}
	
	
	public static void quickSort(int arr[], int si, int ei) {
		
		if(si >= ei) return;
		
		else {
		
			int pivot = partition(arr, si, ei);
			quickSort(arr, si, pivot - 1);
			quickSort(arr, pivot + 1, ei);
				
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,2,3,1};
		System.out.println(Arrays.toString(arr));
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
			

	}

}
