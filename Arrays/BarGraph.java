package Arrays;

public class BarGraph {
	
	public static void barGraph(int arr[]) {
		int max_val = arr[maxIndex(arr)];
		
		for(int row=max_val; row>=1; row--) {
			for(int col=0; col<=arr.length - 1; col++) {
				
				if(col <= maxIndex(arr)) {
					if(col >= isFound(arr, row)) System.out.print("| ");
					else System.out.print("* ");
				}
				else {
					if(col == isFound(arr, row)) System.out.print("| ");
					else System.out.print("* ");
				}
				
				
				
//				if(col >= isFound(arr, row) || col <= maxIndex(arr)) System.out.print("| ");
//				else System.out.print("* ");
			}
			System.out.println("");
		}
		
	}
	
	//isFound
	public static int isFound(int arr[], int val) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == val) return i;
		}
		return -1;
	}
	
	//Maximum of array
	public static int maxIndex(int arr[]) {
		int max = 0 ;
		
		for(int i=1; i<arr.length; i++) {
			if (arr[i] > arr[max]) max = i;
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3,4,5,1,2};
		barGraph(arr);
	}

}
