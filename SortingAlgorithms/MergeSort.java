package SortingAlgorithms;

import java.util.Arrays;

public class MergeSort {
	
	public static int[] merge(int[] arr, int[] brr) {
		
		int ans[] = new int[arr.length + brr.length];
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < arr.length && j < brr.length) {
			if(arr[i] < brr[j]) {
				ans[k] = arr[i];
				i++;	
			}
			else {
				ans[k] = brr[j];
				j++;
			}
			k++;
		}
		
		while(i < arr.length) {
			ans[k++] = arr[i++];
		}
		
		while(j < brr.length) {
			ans[k++] = brr[j++];
		}
		
		return ans;
		
	}
	
	
	public static int[] mergeSort(int arr[], int si, int ei) {
		
		if(si == ei) return new int[] {arr[si]};
		
		int mid = si + (ei - si)/2 ;
		int[] left = mergeSort(arr, si, mid);
		int[] right = mergeSort(arr, mid+1, ei);
		
		return merge(left, right);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {4,3,1,2,4,5,6,9,7,8} ;
		System.out.println(Arrays.toString(arr));
		
		int ans[] = mergeSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(ans));

	}

}
