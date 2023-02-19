package Recurssion;

public class Power {
	
	public static int pow(int a, int b) {
		
		if(b == 0) return 1;
		
		return pow(a, b-1)*a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pow(0,5));

	}

}
