package TwoDimensional_Array;

import java.util.Arrays;

public class RotateMatrix {
	
	public static void rotate(int[][] arr) {
		int arr1[][] = new int[arr[0].length][arr.length];
		
		for(int col=0; col<arr[0].length; col++) {
			for(int row=0; row<arr.length; row++) {
				arr1[col][arr.length-1-row] = arr[row][col];
			}
		}
		arr = arr1;
		System.out.println(Arrays.deepToString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
		System.out.println(Arrays.deepToString(arr));
		
		rotate(arr);
		System.out.println(Arrays.deepToString(arr));
	
	}

}
