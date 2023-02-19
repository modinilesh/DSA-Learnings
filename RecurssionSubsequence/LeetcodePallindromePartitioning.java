package RecurssionSubsequence;

import java.util.ArrayList;
import java.util.List;

public class LeetcodePallindromePartitioning {
	
	public static boolean isPallindrome(String s) {
		for(int i=0; i<s.length()/2; i++) {
			if(s.charAt(i) != s.charAt(s.length()-1-i)) return false;
		}
		
		return true;
	}
	
	public static void pallindromePartition(String q, String ans) {
	
		
		if(q.length() == 0) {
			System.out.println(ans.substring(0, ans.length()-1));
		}
		else {
			
			for(int i=1; i<q.length()+1; i++) {
				String nq = q.substring(i);
				String nans = q.substring(0, i);
				
				if(isPallindrome(nans)) {
					pallindromePartition(nq, ans+nans+"-");
				}
			}
			
		}
		
	}
	
	
	
	public static List<List<String>> pp(String q, List<String> ans, List<List<String>> fans){
		
		if(q.length() == 0) {
			List<String> arr = new ArrayList<>(ans);
			fans.add(arr);
			return fans;
		}
		else {
			
			for(int i=1; i<q.length()+1; i++) {
				String nq = q.substring(i);
				String nans = q.substring(0, i);
				
				if(isPallindrome(nans)) {
					
					ans.add(nans);
					pp(nq, ans, fans);
					ans.remove(ans.size()-1);
				}
			}
			return fans;
		}
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pallindromePartition("nitin", "");
		List<String> ans = new ArrayList<>();
		List<List<String>> fans = new ArrayList<List<String>>();
		
		fans = pp("nitin", ans, fans);
		
		//System.out.println(fans);
		
		
	}

}
