package Arrays;

import java.util.Arrays;

public class RotateK {
	
	
	//Rotating array by 1 times
	public static void rotate_1(int[] arr) {
		int temp = arr[arr.length-1];
		for(int i=arr.length-2; i>=0; i--) {
			arr[i+1] = arr[i] ;
		}
		arr[0] = temp ;
		System.out.println(Arrays.toString(arr));
	}
	
	//Rotating array by k times
	public static void rotate_K (int[]arr, int k) {
		k = k % arr.length ;
		
		if(k<0) k += arr.length;
		
		for(int i=1; i<=k; i++) {
			rotate_1(arr);
		}
	}
	
	//Reversing array
	public static void reverse(int[] arr, int i, int j) {

		while(i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i++;
			j--;
		}
		
	}
	
	
	//Rotating array by k times
	public static void rotate_K2(int arr[], int k) {
		
		k = k % arr.length ;
		if(k<0) k += arr.length;
		int n = arr.length - k - 1;
		
		reverse(arr, 0, n);  			     //A reverse
		reverse(arr, n+1, arr.length-1);    //B reverse
		reverse(arr, 0, arr.length-1);		//Whole reverse
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5};
		
		rotate_K2(arr, 1);
		System.out.println(Arrays.toString(arr));
		
	}

}
