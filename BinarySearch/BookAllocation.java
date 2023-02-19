package BinarySearch;
//SAME LOGIC WILL BE USED
// FOR THE QUESTION OF
// PAINTER'S PARTITION 


public class BookAllocation {
	
	public static int sum(int arr[]) {
		int a = 0;
		for(int i : arr) {
			a += i;
		}
		return a;
	}
	
	public static boolean isItPossible(int arr[], int mid, int stdnt) {
		int pageSum = 0;
		int studentCount = 1;
		
		for(int i=0; i<arr.length; i++) {
			
			if(pageSum + arr[i] <= mid) pageSum += arr[i];
			else {
				studentCount++;
				if(studentCount > stdnt || arr[i] > mid) return false;
				else {
					pageSum = arr[i];
				}
			}
			
		}
				
		return true;
		
	}
	
	
	public static int minPages(int arr[], int m) {
		int s = 0;
		int e = sum(arr);
		int ans = -1;
		
		while (s <= e) {
			int mid = s + (e-s)/2;
			System.out.println(mid);
			
			if(isItPossible(arr, mid, m)) {
				ans = mid;
				System.out.println("---> "+ ans);
				e = mid -1;
			}
			
			else s = mid + 1;
		}
		return ans;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {31, 14, 19, 75};
		System.out.println(minPages(arr, 12));
		
		System.out.println(isItPossible(arr, 69, 12));

	}

}
