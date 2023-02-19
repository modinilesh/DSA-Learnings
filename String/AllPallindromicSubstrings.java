package String;

public class AllPallindromicSubstrings {
	
	public static boolean isPallindrome(String str) {
		int i = 0;
		int j = str.length() - 1;
		
		while(i < j) {
			if(str.charAt(i) != str.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}
	
//	public static int pllSubStrings(String s) {
//		int count = 0;
//		
//		for(int i=0; i<s.length(); i++) {
//			for(int j=i+1; j<=s.length(); j++) {
//				if(isPallindrome(s.substring(i, j)){
//					System.out.println(s.substring(i, j));
//					count++;
//				}
//			}
//		}
		
		
		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "nilesh" ;
//		pllSubStrings(s);

	}

}
