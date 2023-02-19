package Arrays;

public class MaximumSubarraySum {
	
	
	
	//Complexity O(n2)
	public static int maxSubarraySum(int arr[]) {
		int max = Integer.MIN_VALUE;
		
		for(int s=0; s<arr.length; s++) {
			int sum = 0;
			for(int i=s; i<arr.length; i++) {
				sum += arr[i];
				if(sum > max) max = sum;
			}
		}
		
		return max;
	}
	
	//for complexity O(n) Kadanes algorithm is used
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4};
		
		System.out.print(maxSubarraySum(arr)); 

	}

}
