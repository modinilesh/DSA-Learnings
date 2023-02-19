package Recurssion;

public class Factorial {
	
	public static int fact(int n) {
		if(n<0) return -1;
		
		if(n == 0) return 1;
		
		return fact(n-1)*n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5));

	}

}
