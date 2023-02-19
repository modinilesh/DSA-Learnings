package RecurssionSubsequence;

public class PossibleStringsFromNumber {
	
	
	public static void printPossibleStrings(String str, String ans) {
		
		if( str.length() == 0 ) {
			System.out.println(ans);
			return;
		}
		else {
			printPossibleStrings(str.substring(1), ans + (char)(str.charAt(0) + 16) );
			
			if(str.length() >= 2) {
				int n = Integer.valueOf(str.substring(0, 2));
				if(n <= 26) {
					printPossibleStrings(str.substring(2), ans + (char)(Integer.valueOf(str.substring(0, 2))+64));
				}
			}
		}
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printPossibleStrings("36671106", "");
		
		//System.out.println(Integer.parseInt("@"));
	}

}
