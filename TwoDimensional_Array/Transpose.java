package TwoDimensional_Array;

import java.util.Arrays;

public class Transpose {
	
	public static void transpose(int arr [][]) {
		for(int row=1; row<arr.length; row++) {
			for(int col=0; col<row; col++) {
				int temp = arr[row][col];
				arr[row][col] = arr[col][row];
				arr[col][row] = temp;
			}
		}
	}
	
	public static void display(int[][]arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		//Given array
		display(arr1);
		System.out.println("---------------------");
		
		//After Transpose
		transpose(arr1);
		display(arr1);
		

	}

}
