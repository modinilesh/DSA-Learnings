package Recurssion;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayRecursion {
	
	//Storing occurrences in an Array
	public static int[] storingOccuranceInArray(int arr[], int i, int n, int ele, int count) {
			
			if(i == n) {
				return  new int [count];
			}
			else {
				
				if(arr[i] == ele) count++;
				
				int[] ans = storingOccuranceInArray(arr, i+1, n, ele, count);
				
				if(arr[i] == ele) ans[--count] = i;
				
				return ans;
			}
			 
			
		}
	
	
	
	
	
	//Storing occurrences in an ArrayList without
	//Giving ArrayList as Parameter
	public static ArrayList<Integer> storingOccuranceInArrayList2(int arr[], int i, int n, int ele) {
		
		if(i == n) {
			return  new ArrayList<Integer>();
		}
		else {
			ArrayList<Integer> list = storingOccuranceInArrayList2(arr, i+1, n, ele);
			
			if(arr[i] == ele) list.add(i);
			
			return list;
		}
		 
		
	}
	
	
	
	//Storing occurrences in an ArrayList
	public static ArrayList<Integer> storingOccuranceInArrayList(int arr[], int i, int n, int ele, ArrayList<Integer> list) {
		
		if(i<n && arr[i] == ele) {
			list.add(i);
		}
		if(i == n) {
			return list;
		}
		return storingOccuranceInArrayList(arr, i+1, n, ele, list);
		
	}
	
	
	
	
	
	
	//Array Element all occurance
	public static void allOccurance(int arr[], int i, int n, int ele) {
		
		if(i<n && arr[i] == ele) {
			System.out.print(i + " ");
		}
		if(i == n) {
			return ;
		}
		allOccurance(arr, i+1, n, ele);
		
	}
	
	
	
	
	
	
	//Array Element Last Occurance
	public static int lastOccurance(int arr[], int i, int n, int ele, int ans) {
		
		if(i<n && arr[i] == ele) {
			ans = i;
		}
		if(i == n) {
			return ans;
		}
		return lastOccurance(arr, i+1, n, ele, ans);
		
	}
	
	
	
	
	
	
	//Array Occurance ----> return index
	
	public static int isFound(int arr[], int i, int n, int ele) {
		
		if(i<n && arr[i] == ele) {
			return i;
		}
		if(i == n) {
			return -1;
		}
		return isFound(arr, i+1, n, ele);
		
	}
	
	
	
	
	
	//Maximum element of an Array
	public static int maxElement(int arr[], int i, int n, int max) {
		
		if(i == n) {
			return max;
		}
		if (max < arr[i]) max = arr[i];
		
		return maxElement(arr, i+1, n, max);
		
	}
	
	
	
	
	
	//Display an array
	public static void display(int arr[], int n) {
		
		if(n == 0) {
			return;
		}
		display(arr, n-1);
		System.out.print(arr[n-1]);
		
	}
	
	
	
	//Main function

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,1,1,3,2,7,6,9,2,3,4,5};
		ArrayList<Integer> list = new ArrayList<>();
		display(arr, 5);
		System.out.println();
		
		System.out.println(maxElement(arr, 0, 5, -1));
		System.out.println(isFound(arr, 0, arr.length, 5));
		System.out.println(lastOccurance(arr, 0, arr.length, 2, -1));
		allOccurance(arr, 0, arr.length, 2);
		System.out.println();
		
		System.out.println( storingOccuranceInArrayList(arr, 0, arr.length, 1, list) );
		System.out.println( storingOccuranceInArrayList2(arr, 0, arr.length, 1) );
		
		System.out.println(Arrays.toString(storingOccuranceInArray(arr, 0, arr.length, 2, 0)) );

	}

}
