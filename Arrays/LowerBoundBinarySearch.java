package Arrays;

public class LowerBoundBinarySearch {
	
	public static int lbBinarySearch(int arr[], int ele) {
		int s = 0;
		int e = arr.length-1;
		int ans = -1;
		
		while (s <= e) {
	
			int mid = s + (e-s)/2 ;
			if(ele > arr[mid]) {
				s = mid + 1;
			}
			
			else if(ele < arr[mid]) {
				e = mid - 1;
			}
			
	//AGAR ELEMENT MIL GYA TO ENDING INDEX KO LEFT SHIFT KRDO OR 
	//FIRR SE BINARY SEARCH LGADO TO NAYA INDEX MIL JAEGA
			else {
				ans = mid;
				e = mid - 1;
			}
			
		}
	
		return ans;
	}

	
	public static int ubBinarySearch(int arr[], int ele) {
		int s = 0;
		int e = arr.length-1;
		int ans = -1;
		
		while (s <= e) {
	
			int mid = s + (e-s)/2 ;
			if(ele > arr[mid]) {
				s = mid + 1;
			}
			
			else if(ele < arr[mid]) {
				e = mid - 1;
			}
			
	//AGAR ELEMENT MIL GYA TO STARTING INDEX KO RIGHT SHIFT KRDO OR 
	//FIRR SE BINARY SEARCH LGADO TO NAYA INDEX MIL JAEGA
			else {
				ans = mid;
				s = mid + 1;
			}
			
		}
	
		return ans;
	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,1,1,1,1,1,2,2,2,2,2,3,4,5,5,5,5,6,6,7,8,9,10};
		
		System.out.println(lbBinarySearch(arr, 6));
		System.out.print(ubBinarySearch(arr, 6));
		

	}

}
