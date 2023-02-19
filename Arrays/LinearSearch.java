package Arrays;

public class LinearSearch {
	
	public static int linearSearch(int arr[], int val) {
		//int index = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == val) return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5,6,7,8,9,0};
		System.out.println(linearSearch(arr,6));

	}

}
