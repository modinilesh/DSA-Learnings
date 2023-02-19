package RecurssionSubsequence;

import java.util.ArrayList;
import java.util.Arrays;

public class AsciiSubsequence {
	
	//Get Recursion
	public static ArrayList<String> asciiSubSequence(String s) {
		if(s.length() == 0) {
			return new ArrayList<>(Arrays.asList(""));
		}
		else {
			ArrayList<String> rr = asciiSubSequence(s.substring(1));
			ArrayList<String> ans = new ArrayList<>();
			
			for(String val : rr) {
				ans.add(val);
				ans.add(s.charAt(0)+val);
				ans.add((int)s.charAt(0)+val);
				}
			return ans;
		}
	}
	
	
	
	
	//Print Recursion
	public static void asciiSubSequence(String q, String ans) {
		if(q.length() == 0) {
			System.out.println(ans);
		}
		else {
			asciiSubSequence(q.substring(1), ans);
			asciiSubSequence(q.substring(1), ans + q.charAt(0));
			asciiSubSequence(q.substring(1), ans + (int)q.charAt(0));
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(asciiSubSequence("ab"));
		asciiSubSequence("ab", "");
		
	}

}
