package Recurssion;

public class PrintDecreasing {
	
	public static void printD(int n) {
		if(n == 1) {
			System.out.println(1);
			return;
		}
		
		System.out.println(n);
		printD(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printD(5);

	}

}
