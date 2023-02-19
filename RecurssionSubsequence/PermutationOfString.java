package RecurssionSubsequence;

public class PermutationOfString {
	
	
	
	//Approach 1
	public static void pp(String str, String ans) {
		
		if(str.length() == 0) {
			System.out.println(ans);
		}
		else {
			for(int i=0; i<ans.length()+1; i++) {
				String na = ans.substring(0, i) + str.charAt(0) + ans.substring(i);
				pp(str.substring(1), na);
			}
		}
	}
	
	
	
	
	//Approach 2
	public static void printPermutation(String str, String ans) {
		
		if(str.length() == 0) {
			System.out.println(ans);
		}
		else {
			for(int i=0; i<str.length(); i++) {
				String nq = str.substring(0, i) + str.substring(i+1, str.length());
				printPermutation(nq, ans+str.charAt(i));
			}
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printPermutation("abc", "");
		pp("abc", "");
		System.out.println("abc".substring(1,1));

	}

}
