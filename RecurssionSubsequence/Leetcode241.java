package RecurssionSubsequence;

import java.util.ArrayList;
import java.util.Arrays;


public class Leetcode241 {
	
	
	public static int cal(int a, int b, char ch) {
		if(ch == '+') return a+b;
		else if(ch == '-') return a-b;
		else return a*b;
	}
	
	
	
	public static boolean isOP(char ch) {
		return ch == '+' || ch == '-' || ch == '*' ;
	}
	
	
	public static ArrayList<Integer> differentParantheses(String str){
		
		if(str.indexOf('+') == -1 && str.indexOf('*') == -1 && str.indexOf('-') == -1 ) {
			return new ArrayList<Integer>(Arrays.asList(Integer.parseInt(str)));
		}
		else {
			
			ArrayList<Integer> ans = new ArrayList<>();
			for(int i=0; i<str.length(); i++) {
				if( isOP(str.charAt(i))) {
					
					ArrayList<Integer> left = differentParantheses(str.substring(0, i));
					ArrayList<Integer> right = differentParantheses(str.substring(i+1));
					
					for(int val1 : left) {
						for(int val2 : right) {
							ans.add(cal(val1, val2, str.charAt(i)));
						}
					}
				}
			}
			return ans;	
		}	
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println( differentParantheses("2*3-4*5") );

	}

}