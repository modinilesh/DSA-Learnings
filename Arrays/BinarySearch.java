package Arrays;

public class BinarySearch {
	
	public static int binarySearch(int arr[], int ele) {
		int s = 0;
		int e = arr.length-1;
		
		while (s <= e) {
	
			int mid = s + (e-s)/2 ;
			if(ele > arr[mid]) {
				s = mid + 1;
			}
			
			else if(ele < arr[mid]) {
				e = mid - 1;
			}
			
			else return mid;
			
		}
	
		return -1;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.print(binarySearch(arr, 10));

	}

}
