package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class AdditionofArrays {
	
	public static void addArrays(int arr1[], int arr2[]) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		int carry = 0;
		int i = arr1.length-1;
		int j = arr2.length-1;
		
		while(i>=0 || j>=0) {
			
			if(i<0) {
				list.add(0, (arr2[j] + carry)%10);
				carry = (arr2[j] + carry) / 10;
				j--;
			}
			else if(j<0) {
				list.add(0, (arr1[i] + carry)%10);
				carry = (arr1[i] + carry) / 10;
				i--;
			}
			else {
				list.add(0, (arr1[i] + arr2[j] + carry) % 10);
				carry = (arr1[i] + arr2[j] + carry) / 10 ;
				i--;
				j--;
			}
		}
		if(carry == 1) list.add(0, carry);
		System.out.print(list);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {5,3,3,6} ;
		int arr2[] = {9,6,6,6,4} ;
		
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr1));
		addArrays(arr2, arr1);
	}

}
