package RecurssionSubsequence;

import java.util.ArrayList;
import java.util.Arrays;

public class CoinToss {
	
	
	//Get Recursion
	public static ArrayList<String> coinToss(int n) {
		if(n == 0) {
			return new ArrayList<>(Arrays.asList(""));
		}
		else {
			ArrayList<String> rr = coinToss(n-1);
			ArrayList<String> ans = new ArrayList<>();
			
			for(String val : rr) {
				ans.add("H" + val);
				ans.add("T" + val);
			}
			return ans;
		}
	}
	
	
	//Print Recursion
		public static int coinTossNoTwoHeadsTogether(int n, String ans) {
			if(n == 0) {
				System.out.println(ans);
				return 1;
			}
			else {
				int count = 0;
				if(ans.length() == 0 || ans.charAt(ans.length()-1) != 'H') {
					count += coinTossNoTwoHeadsTogether(n-1, ans+"H");
				}
				count += coinTossNoTwoHeadsTogether(n-1, ans+"T");
				
				return count;
			}
		}
	
	
	
	
	//Print Recursion
	public static void coinToss(int n, String ans) {
		if(n == 0) {
			System.out.println(ans);
		}
		else {
			coinToss(n-1, ans+"H");
			coinToss(n-1, ans+"T");
			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(coinToss(3));
		//coinToss(1, "");
		System.out.println(coinTossNoTwoHeadsTogether(3, ""));

	}

}
