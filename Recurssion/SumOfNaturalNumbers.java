package Recurssion;

public class SumOfNaturalNumbers {
	
	public static int sumN(int n) {
		//BP : 1..........n
		//SP : 1..........n-1
		//Sw : sumN(n-1) + n
		//BC : if 1 return 1
		if( n <= 0 ) return -1;
		if(n == 1) return 1;
		
		return sumN(n-1)+ n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumN(13));

	}

}
