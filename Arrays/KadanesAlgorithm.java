package Arrays;

public class KadanesAlgorithm {
	
	public static int maxSubSum(int arr[]) {
		int max = Integer.MIN_VALUE ;
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			if(sum > max) max = sum;
			if(sum < 0) sum = 0;
		}
		
		return max;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,-2,3,-2};
		
		System.out.print(maxSubSum(arr)); 

	}

}
