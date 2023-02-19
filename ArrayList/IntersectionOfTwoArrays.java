package ArrayList;

import java.util.ArrayList;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Given two sorted arrays
		
		int arr[] = {1,1,2,2,2,3,4,4,5,5,6,7,8,8,9};
		int arr1[] = {1,1,1,3,4,7,10,10,11,12};
		ArrayList<Integer> arr2 = new ArrayList<>();
		
		
		int i = 0;
		int j = 0;
		
		while(i<arr.length && j<arr1.length) {
			
			if(arr[i] == arr1[j]) {
				arr2.add(arr[i]);
				i++;
				j++;
			}
			
			else if(arr[i] > arr1[j]) {
				j++;
			}
			else i++;
		}
		
		System.out.print(arr2);

	}

}
