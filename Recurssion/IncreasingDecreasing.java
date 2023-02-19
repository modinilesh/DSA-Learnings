package Recurssion;

public class IncreasingDecreasing {
	
	public static void printID(int n) {
		if(n<=0) return;
		if(n == 1) {
			System.out.println(1);
			return;
		}
		
		System.out.println(n);
		printID(n-1);
		System.out.println(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printID(10);

	}

}
