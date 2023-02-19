package Arrays;

public class CircularMaxSubarraySum {
	
	
	//Normal kadanes algorithm
	public static int maxSumSubarray(int arr[]) {
		int max = Integer.MIN_VALUE;
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			if(max < sum) max = sum;
			if(sum < 0) sum = 0;
		}
		
		return max;
	}
	
	
	
	//Sum of Array
	public static int sumOfArray(int arr[]) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	//Sub array with Minimum Sum  ----- Using opposite kadanes approach 
	public static int minSumSubarray(int arr[]) {
		int min = Integer.MAX_VALUE;
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			if(sum < min) min = sum;
			if(sum > 0) sum = 0;
		}
		return min;
	}
	
	
	
	//Sub array with Minimum Sum  ----- By multiplying in given array by -1 
	//then used normal kadanes approach
		public static int minSumSubarray2(int arr[]) {
			int min = Integer.MIN_VALUE;
			int sum = 0;
			for(int i=0; i<arr.length; i++) {
				sum += -1*arr[i];
				if(sum > min) min = sum;
				if(sum < 0) sum = 0;
			}
			return -1*min;
		}
		
		
	
	
	//Maximum circular Sub array Sum
	public static int maxCircularSubarraySum(int arr[]) {
		int t_sum = sumOfArray(arr);
		int s = minSumSubarray(arr);
		int max2 = t_sum - s ;
		int max1 = maxSumSubarray(arr);
		
		if(max1 > max2) return max1;
		
		return max2;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,-2,3,4,-5,8,-20,-8,9};
		System.out.println(maxSumSubarray(arr));
		System.out.println(sumOfArray(arr));
		System.out.println(minSumSubarray2(arr));
		
//		System.out.println(maxCircularSubarraySum(arr));
		
		

	}

}
