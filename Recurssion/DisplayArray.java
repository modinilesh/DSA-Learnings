package Recurssion;

public class DisplayArray {
	
	public static void print(int arr[], int n) {
		if(n == 0) {
			return;
		}
		
		print(arr, n-1);
		System.out.print(arr[n-1] + " "); ;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		print(arr, 5);

	}

}
