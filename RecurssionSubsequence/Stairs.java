package RecurssionSubsequence;

import java.util.ArrayList;
import java.util.Arrays;

public class Stairs {
	
	
	//GET RECURSION
		public static ArrayList<String> stairs(int n){
			
			if(n == 0) {
				return new ArrayList<>(Arrays.asList(""));
			} 
			else {
				ArrayList<String> rr1 = stairs(n-1);
				ArrayList<String> ans = new ArrayList<>();
				
				if (n>=2) {
					ArrayList<String> rr2 = stairs(n-2);
					for(String val : rr2) {
					ans.add(val + 2);
					}
				}
				
				for(String val : rr1) {
					ans.add(val + 1);
				}
				
				
				
				
				return ans;
				
			}	
			
		}
	
	
	
	
	
	
	//Print Recursion
	public static int stairs(int n, String ans) {
		if(n == 0) {
			System.out.println(ans);
			return 1;
		}
		else {
			int count = 0;
			count += stairs(n-1, ans + 1);	//1 step
			if(n >= 2) {
				count += stairs(n-2, ans + 2);	//2 step
			}
			
			
			return count;
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(stairs(5, ""));
		
		System.out.println(stairs(5));

	}

}
