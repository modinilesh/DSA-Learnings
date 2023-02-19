package RecurssionSubsequence;

import java.util.ArrayList;

public class LexicographicalNumbers {
	
	
	public static void lexiCographic(int ct,int n, ArrayList<Integer> list) {
		
		if(ct > n) {
			return;
		}
		else {
			list.add(ct);
			for(int j=0; j<=9; j++) {
				lexiCographic( ct*10+j, n, list);
			}
		}	
		
	}
	
	
	public static void lexiCographic2(int ct,int n, ArrayList<Integer> list) {
		
		if(ct == 0) {
			for(int j=1; j<=9; j++) {
				lexiCographic2(j, n, list);
			}
		}
		
		else if(ct > n) {
			return;
		}
		else {
			list.add(ct);
			for(int k=0; k<=9; k++) {
				lexiCographic2( ct*10+k, n, list);
			}
		}	
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<>();
		
//		for(int i=1; i<=9; i++) {
//			lexiCographic(i, 13, list);
//		}
		
		lexiCographic2(0, 13, list);
		System.out.println(list);

	}

}
