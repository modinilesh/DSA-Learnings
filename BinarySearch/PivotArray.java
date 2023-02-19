package BinarySearch;

public class PivotArray {
	
	
	public static int pivotIndex(int arr[]) {
		int s = 0;
		int e = arr.length-1;
		
		while(s < e) {
			int mid = s + (e-s)/2;
			
			if (arr[mid] >= arr[0]) s = mid+1;
			else e = mid;
		}
		
		return e;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {8,9,11,14,2,3,4};
		System.out.println(pivotIndex(arr));

	}

}
