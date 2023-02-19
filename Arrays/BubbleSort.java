package Arrays;

import java.util.Arrays;

public class BubbleSort {
	
	
	public static void bubbleSort(int arr[]) {
		
		for(int i=1; i<arr.length; i++) {
			int swap =0;
			
			for(int j=0; j<arr.length-1; j++) {		//we can write j<arr.length-1-(i-1)......as
													//after each iteration one last comparison will already be sorted 
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap++ ;
				}
			}
			if( swap == 0) break;
			System.out.println(Arrays.toString(arr));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {4,3,1,2} ;
		System.out.println(Arrays.toString(arr));
		
		bubbleSort(arr);
		

	}

}
