package Arrays;

public class SubArrays {
	
	
	//Printing Subarrays 
	public static void subArrays(int arr[]) {
		
		for(int s=0; s<arr.length; s++) {
			
			for(int i=s; i<arr.length; i++) {
				for(int j=s; j<=i; j++) {
					System.out.print(arr[j] + " ");
				}
				System.out.println("");
				
			}
			System.out.println("");
		}
		
		
	}
	
	
	
	//Printing sum of all subarrays----------> O(n3) complexity
	public static void sumSubArrays(int arr[]) {
		int sum = 0;
		
		for(int s=0; s<arr.length; s++) {
			
			for(int i=s; i<arr.length; i++) {
				for(int j=s; j<=i; j++) {
					sum += arr[j] ;
				}
				System.out.println(sum);
				sum = 0;
				
			}
			System.out.println("");
		}
		
		
	}
	
	
	//Printing sum of all subarrays----------> O(n2) complexity
	public static void sumSubArrays2(int arr[]) {
		
		
		for(int s=0; s<arr.length; s++) {
			
			int sum = 0;
			for(int i=s; i<arr.length; i++) {
				sum += arr[i];
				System.out.println(sum);	
			}
			System.out.println("");
		}
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4};
		//subArrays(arr);
		sumSubArrays2(arr);

	}

}
