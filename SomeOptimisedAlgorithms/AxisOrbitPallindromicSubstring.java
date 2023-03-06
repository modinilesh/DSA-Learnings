package SomeOptimisedAlgorithms;

public class AxisOrbitPallindromicSubstring {
	
	//Method 1
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
	
	public static int pllSubStrings(String s) {
		int count = 0;
		
		for(int i=0; i<s.length(); i++) {
			for(int j=i+1; j<=s.length(); j++) {
				if(isPallindrome(s.substring(i, j)))
				{
					System.out.println(s.substring(i, j));
					count++;
				}
			}
		}
		return count;
		
	}

	
	//Method 2, Axis orbit algorithm------> O(n*n)
	
	public static int countPS(String str) {
		int count = 0;
		
		//ODD length Substring
		for(int i=0; i<str.length(); i++) {
			count++;
			int left = i-1;
			int right = i+1;
			
			while(left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right))
			{
				count++;
				left--;
				right++;
			}
		}
		
		
		//Even String
		for(int i=0; i<str.length()-1; i++) {
			int left = i;
			int right = i+1;
			
			while(left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right))
			{
				count++;
				left--;
				right++;
			}
		}
		
		return count;
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countPS("nitinn"));
	}

}
