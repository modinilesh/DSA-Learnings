package RecurssionBacktracking;

public class QueensPermutationsCombinationsIn2DBoard {
	
	
	//Permutations
		public static void queensPermutations(boolean board[][], int m, int qpsf, String ans) {
			
			if(m == 0) {
				System.out.println(ans);
			}
			else {
				
				for(int i=0; i<board.length; i++) {
					for(int j=0; j<board[0].length; j++) {
					
						if(board[i][j] == false) {
							
							board[i][j] = true;
							queensPermutations(board, m-1,qpsf+1, ans+"q"+qpsf+"b"+i+""+j+" "); //qpsf stands for Queen Placed So Far	
							board[i][j] = false;
						}
					}
				}
				
			}
		}
	
		
		//Combinations
		public static void queensCombinations(boolean board[][],int lastI, int lastJ, int m, int qpsf, String ans) {
			
			if(m == qpsf) {
				System.out.println(ans);
			}
			else {
				
				for(int i=lastI; i<board.length; i++) {
					
					int j = 0;
					if(i == lastI) j = lastJ;
					
					for(; j<board[0].length; j++) {
					
						if(board[i][j] == false) {
							
							board[i][j] = true;
							queensCombinations(board,i, j, m,qpsf+1, ans+"q"+"b"+i+""+j+" "); //qpsf stands for Queen Placed So Far	
							board[i][j] = false;
						}
					}
				}
				
			}
		}
	
		
	//Combinations Board's respect Method1
		public static void qcBoardsRespect1(boolean[][] board,int i, int j, int qpsf, int tq, String ans) {
			
			if(tq == qpsf) {
				System.out.println(ans);
				return;
			}
			else if(i >= board.length) return;		//Reached outside last row
			else if(j >= board[0].length) {			//Reached outside last Column
				qcBoardsRespect1(board,i+1, 0, qpsf, tq, ans);
			}
			else {
			
						
					//Place
					board[i][j] = true;
					qcBoardsRespect1(board,i, j+1, qpsf+1, tq, ans+"q"+"b"+i+j+" ");
					board[i][j] = false;
						
					//Not Place
					qcBoardsRespect1(board,i, j+1, qpsf, tq, ans);
						
				
			}
		}
		
		//Combinations Board's respect Method2
				public static void qcBoardsRespect2(boolean[][] board,int i, int j, int qpsf, int tq, String ans) {
					
					if(tq == qpsf) {
						System.out.println(ans);
						return;
					}		
					
					if(j >= board[0].length) {			//Reached outside last Column
						j = 0;
						i = i+1;
					}
					
					if(i >= board.length) return;		//Reached outside last row
					
					else {
					
								
							//Place
							board[i][j] = true;
							qcBoardsRespect2(board,i, j+1, qpsf+1, tq, ans+"q"+"b"+i+j+" ");
							board[i][j] = false;
								
							//Not Place
							qcBoardsRespect2(board,i, j+1, qpsf, tq, ans);
								
						
					}
				}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] board = new boolean[2][3];
		
		//queensPermutations(board, 2, 0, "");
		//queensCombinations(board,0,0, 2, 0, "");
		//qcBoardsRespect1(board,0,0, 0, 2, "");
		qcBoardsRespect2(board,0,0, 0, 2, "");

	}

}
