package Recurssion;

public class TailRecursion {
	
	
	//Fibonacci
	public static void fib(int a, int b, int n) {
		if(n == 0) {
			System.out.print(n);
			return ;
		}
		int sum = a + b;
		System.out.print(sum + " ");
		fib(b, sum, n-1);
	}
	
	
	
	//power(a, b)
	public static int power(int a, int b) {
		if(b == 0) return 1;
		
		return a * power(a, b-1);
	}
	
	
	
	//Factorial
	public static int fact(int n) {
		if(n == 0) return 1;
		
		return n * fact(n-1);
	}
	
	
	
	//SumN
	public static int sumN(int n) {
		if(n == 0) return n;
		
		return n + sumN(n-1);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println( sumN(5) );
//		System.out.println( fact(5) );
//		System.out.println( power(5, 0) );
		//fib(1, 1, 5);
		
		
	}

}
