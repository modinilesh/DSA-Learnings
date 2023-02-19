package Arrays;

public class SQRTBinarySearch {
	
	public static boolean isItPossible(int mid, int num, int k) {
		return  Math.pow(mid, k) <= num ;
	}
	
	
	public static int sqrt(int num, int k) {
		int s = 0 ;
		int e = num ;
		int ans = -1;
		
		while (s <= e) {
	
			int mid = s + (e-s)/2 ;
			if( isItPossible(mid, num, k) ) {
				ans = mid;
				s = mid +1;
			}
			
			else {
				e = mid-1;
			}
			
		}
	
		return ans;
	}
	
	
	public static int mySqrt(int x) {
        long s = 0;
        long e = x;
        long ans = -1;

        while(s <= e){
            long mid = s + (e-s)/2 ;
            long sqr = mid*mid;

            if(sqr == x) return (int)mid;

            if(sqr > x) e = mid - 1;
            else if(sqr < x) {
                ans = mid;
                s = mid + 1;
            }
        }

        return (int)ans;
        
    }
	
	public static double preciseSqrt(int n, int precision) {
		double factor = 1;
		double ans = mySqrt(n);
		
		for(int i=0; i<precision; i++) {
			factor = factor/10;
			for(double j=ans; j*j<=n; j+=factor) {
				ans = j;
			}
		}
		return ans;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.print(sqrt(125, 3));
		
		//System.out.print( mySqrt(27) );
		System.out.printf("%4.2f" ,preciseSqrt(37, 2) );

	}

}
