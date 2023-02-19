package Recurssion;

public class ArrayOccurance {
	
	public static int search(int arr[], int i, int target) {
		
		if(i == arr.length) return -1;
		
		else {
			if(arr[i] == target) {
				return i;
			}
			else return search(arr, i+1 ,target);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5};
		System.out.print(search(arr, 0, 3));

	}

}
