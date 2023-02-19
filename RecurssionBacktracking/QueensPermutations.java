package RecurssionBacktracking;

public class QueensPermutations {
	
	
	
	
	//Permutations
	public static void queensPermutations(boolean arr[], int m, int qpsf, String ans) {
		
		if(m == 0) {
			System.out.println(ans);
		}
		else {
			
			for(int i=0; i<arr.length; i++) {
				
				if(arr[i] == false) {
					
					arr[i] = true;
					queensPermutations(arr, m-1,qpsf+1, ans+"q"+qpsf+"b"+i+" "); //qpsf stands for Queen Placed So Far	
					arr[i] = false;
				}	
			}
			
		}
	}
	
	
	
	
	//Combinations
		public static void queensCombinations(boolean arr[],int index, int m, int qpsf, String ans) {
			
			if(m == qpsf) {
				System.out.println(ans);
			}
			else {
				
				for(int i=index; i<arr.length; i++) {
					
					if(arr[i] == false) {
						
						arr[i] = true;
						queensCombinations(arr,i+1, m,qpsf+1, ans+"q"+qpsf+"b"+i+" "); //qpsf stands for Queen Placed So Far	
						arr[i] = false;
					}	
				}
				
			}
		}
		
		
		
		
	//Combinations by Board's Respect
		public static void queensCombinationsBoardsRespect(boolean arr[],int i, int m, int qpsf, String ans) {
			
			if(m == qpsf) {
				System.out.println(ans);
			}
			else if( i >= arr.length) return;
			else {
					
					//Place
//					arr[i] = true;
					queensCombinationsBoardsRespect(arr, i+1, m, qpsf+1, ans+"q"+"b"+i);
//					arr[i] = false;
					
					//Not Place
					queensCombinationsBoardsRespect(arr, i+1, m, qpsf, ans);
						
			}
		}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean arr[] = new boolean[4];
		//queensPermutations(arr, 2,0, "");
		//queensCombinations(arr, 0, 2,0, "");
		queensCombinationsBoardsRespect(arr, 0, 2, 0, "");
	}

}
