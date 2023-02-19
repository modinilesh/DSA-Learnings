package RecurssionSubsequence;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintingSubsequence {
	
	
	//PRINT RECURSION
	public static void subSequence(String q, String a) {
		
		if(q.length() == 0) {
			System.out.print(a + ", ");
		}
		else {
			subSequence(q.substring(1), a);
			subSequence(q.substring(1), a+ q.charAt(0));
		}
		
	}
	
	
	
	
	
	
	
	//GET RECURSION
	public static ArrayList<String> subSeq(String s){
		
		if(s.length() == 0) {
			return new ArrayList<>(Arrays.asList(""));
		}
		else {
			ArrayList<String> rr = subSeq(s.substring(1));
			ArrayList<String> ans = new ArrayList<>();
			
			for(String val : rr) {
				ans.add(val);
				ans.add(s.charAt(0) + val);
			}
			
			return ans;
			
		}	
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(subSeq("abc"));
		subSequence("abc", "");

	}

}
