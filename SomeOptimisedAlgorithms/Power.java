package SomeOptimisedAlgorithms;

public class Power {
	
	//method 1 -------> O(n)
	public static int power(int a, int n) {
		
		if(n == 1) return a;
		
		else if( n%2 == 0) {
			return power(a, n/2)*power(a, n/2);
		}
		else {
			return power(a, n/2)*power(a, n/2)*a;
		}
		
	}
	
	//method 2---------O(logn)
	public static int fastPower(int a, int n) {
		
		if(n == 1) return a;
		
		else {
			int b = power(a, n/2);
		
			if( n%2 == 0) {
				return b*b;
			}
			else {
				return b*b*a;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(power(2, 10));
		System.out.println(fastPower(2, 10));
		
	}

}
