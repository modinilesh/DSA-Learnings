package RecurssionSubsequence;

import java.util.ArrayList;

public class CombinationOfPhoneNumber {
	
	
	
	public static ArrayList<String> keypadCombination(String str, String ans, ArrayList<String> list) {
		String arr[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

		
		if(str.length() == 0) {
			list.add(ans);
			return list;
		}
		
		else {
			String c = arr[str.charAt(0) - '0']; //to get that particular value
			for(int i=0; i<c.length(); i++) {
				
				keypadCombination(str.substring(1), ans + c.charAt(i), list);
			}
			
			return list;
		}
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		
		keypadCombination("29", "", list);
		System.out.println(list);
	}

}
