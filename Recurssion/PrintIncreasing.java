package Recurssion;

public class PrintIncreasing {
	
	public static void printI(int n) {
		if(n == 1) {
			System.out.println(1);
			return;
		}
		
		printI(n-1);
		System.out.println(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printI(5);

	}

}
