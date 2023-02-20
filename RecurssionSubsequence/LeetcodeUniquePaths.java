package RecurssionSubsequence;

public class LeetcodeUniquePaths {
	
	
	
	public static int mazePath(int i, int j, int m, int n, String ans) {
		if(i == m && j == n) {
			System.out.println(ans);
			return 1;
		}
		else if(i > m || j > n || i == 0) return 0;
		else {
			int count = 0;
			count += mazePath(i, j+1, m, n, ans+"H");
			count += mazePath(i+1, j, m, n, ans+"V");
			
			
			return count;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(mazePath(0,0, 4,4, ""));

	}

}
