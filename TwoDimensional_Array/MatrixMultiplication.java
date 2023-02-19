package TwoDimensional_Array;

import java.util.*;

public class MatrixMultiplication {
	
	
	public static int[][] matrixMul(int arr1[][], int arr2[][]){
		
		if(arr1[0].length != arr2.length) {
			System.out.println("Multiplication can not be calculated");
			return null;
		}
		
		int arr[][] = new int[arr1.length][arr2[0].length];
		int sum = 0;
		
		for(int row=0; row<arr1.length; row++) {
			for(int col=0; col<arr2[0].length; col++) {
				
				for(int j=0; j<arr2.length; j++) {
					sum = sum + (arr1[row][j] * arr2[j][col]);
				}
				
				arr[row][col] = sum;
				sum = 0;
				
			}
		}
	
		return arr;
	}
	
	
	public static void display(int arr[][]) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println("----------------------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int arr2[][] = {{1,2,3},{2,2,2},{3,3,3},{4,4,4}};
		
		display(arr1);
		display(arr2);
		int[][] arr = matrixMul(arr1, arr2) ;
		display(arr);
		

	}

}
