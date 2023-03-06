package SomeOptimisedAlgorithms;

public class PrimeNumber {
	
	
	//method 1 -----> O(N root n)
	public static void prime(int n, int N) {
		
		for(; n<=N; n++) {
			int j=2;
			boolean flag = true;
			for(; j*j <= n; j++) {
				if(n%j == 0) {
					flag = false;
					break;
				}
			}
			if(flag) System.out.println(n);
			
			
		}
		
	}
	
	
	// method 2, prime sieves algorithm O(nloglogN)
	public static void prime2(int n, int N) {
		boolean flag[] = new boolean[N+1];
		
		for(int i=2; i<=N; i++) {
			if(flag[i] == false) {
				System.out.println(i);
				for(int j=2*i; j<=N; j+=i) {
					flag[j] = true;
				}
			}
		}
		
	}
	
	//method 3
	public static void prime3(int n, int N) {
		boolean flag[] = new boolean[N+1];
		
		for(int i=2; i*i<=N; i++) {
			if(flag[i] == false) {
				//System.out.println(i);
				for(int j=2*i; j<=N; j+=i) {
					flag[j] = true;
				}
			}
		}
		for(int i=n; i<=N; i++) {
			if(flag[i] == false) {
				System.out.println(i);
			}
		}
		
	}
	
	//method 4
	public static void prime4(int n, int N) {
		boolean flag[] = new boolean[N+1];
		
		for(int i=2; i*i<=N; i++) {
			if(flag[i] == false) {
				//System.out.println(i);
				for(int j=i*i; j<=N; j+=i) {
					flag[j] = true;
				}
			}
		}
		for(int i=n; i<=N; i++) {
			if(flag[i] == false) {
				System.out.println(i);
			}
		}
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//prime(11, 30);
		//prime2(2, 30);
		//prime3(7, 30);
		prime4(7, 30);

	}

}
