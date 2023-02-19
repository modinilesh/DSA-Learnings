package BinarySearch;

public class FindMountainElement {
	
	
	
	public static int peak(int arr[]) {
		
		int ans = 1;
		int s = 0;
		int e = arr.length -1;
		
		while(s < e) {
			int mid = s + (e-s)/2;
			
			if( arr[mid] < arr[mid+1]) {
				s = mid + 1;
			}
			else {
				if (arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]) {
					ans = mid;
					break;
				}
				
				else e = mid ;	
			}
		
		}
		
		return arr[ans];
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5,6,7,2,0};
		//7 is the peak or mountain element
		
		System.out.println(peak(arr));

	}

}
