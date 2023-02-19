package TwoDimensional_Array;

public class OptimisedTraversing {
	
	public static String isFound(int[][]arr, int key) {
		
		int row = 0;
		int col = arr[0].length-1;
		
		while(col >= 0 && row < arr.length) {
			
			if(arr[row][col] == key) return row+""+col;
			else if( arr[row][col] < key) {
				row++;
			}
			else col--;
			
		}
	
		return "NotFound";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,5,10,15,20},{2,7,12,21,26},{4,8,15,25,28},{5,17,18,30,40},{10,11,20,35,50}};
		
		//Traversing can be done through various process
		//1. Normal traversing each element : Time Complexity : MN
		//2. if all rows and columns are sorted :
			//1. Binary search : Row ko pakadkr column me lgao to MlogN complexity or agar ulta karo to NlogM complexity
			//2. Top right ya bottom left ko pkdkr traverse krdo to M+N complexity
		
		System.out.print(isFound(arr, 4));

	}

}
