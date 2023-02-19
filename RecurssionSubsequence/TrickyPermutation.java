package RecurssionSubsequence;

public class TrickyPermutation {
	
	
	public static void uniquePermutation(String str, String ans) {
		
		if(str.length() == 0) {
			System.out.println(ans);
		}
		else {
			
			
			for(int i=0; i<str.length(); i++) {
				char ch = str.charAt(i);
				boolean flag = true;
				
				for(int j=0; j<i; j++) {
					if(str.charAt(j) == ch) {
						flag = false;
						break;
					}
				}
				
				if(flag == true) {
					
					String nq = str.substring(0, i) + str.substring(i+1) ;
					
					uniquePermutation(nq, ans+ str.charAt(i));
				}
				
			}
		}
			
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		uniquePermutation("abcb", "");

	}

}
