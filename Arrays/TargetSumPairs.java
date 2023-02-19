package Arrays;

public class TargetSumPairs {
	
	
	
	//Two Pointers Approach
	//will be worked for sorted arrays
	public static void targetSumEfficient(int arr[], int target) {
		
		int s = 0;
		int e = arr.length - 1;
		while(s < e) {
			int sum = arr[s] + arr[e];
			
			if(sum > target) e--;
			else if(sum < target) s++;
			else {
				System.out.println(arr[s] +" and "+ arr[e]);
				s++;
				e--;
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8};
		targetSumEfficient(arr, 5);

	}

}
