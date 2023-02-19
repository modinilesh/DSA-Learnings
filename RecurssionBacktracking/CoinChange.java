package RecurssionBacktracking;

public class CoinChange {
	
	
	//Permutations
	public static void coinChangePermutations(int arr[], int target, String ans) {
		
		if(target == 0) {
			System.out.println(ans);
		}
		else {
			
			for(int i=0; i<arr.length; i++) {
				
				if (target >= arr[i])
					coinChangePermutations(arr, target - arr[i], ans+arr[i]);
			
			}
		}
		
	}
	
	//Combinations
	public static void coinChangeCombinations(int arr[], int index, int target, String ans) {
		
		if(target == 0) {
			System.out.println(ans);
		}
		else {
			
			for(int i=index; i<arr.length; i++) {
				
				if (target >= arr[i])
					coinChangeCombinations(arr, i, target - arr[i], ans+arr[i]);
			
			}
		}
		
	}
	
	
	//Combinations Through coin's respect
		public static void cccCoinRespect(int arr[], int i, int target, String ans) {
			
			if(target == 0) {
				System.out.println(ans);
			}
			else if(target < 0 || i >= arr.length) return;
			else {
			
						//Pick
						cccCoinRespect(arr, i, target - arr[i], ans+arr[i]);
						
						
						//Not Pick
						cccCoinRespect(arr, i+1, target, ans);
				
			}
			
		}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,5};
		//coinChangePermutations(arr, 3 , "");
		//coinChangeCombinations(arr, 0 , 3 , "");
		cccCoinRespect(arr, 0 , 5 , "");

	}

}
