package RecurssionBacktracking;

public class QueensKill {
	
	
	public static boolean isItPossible(boolean board[][], int i, int j) {
		
		//check in left Direction
		for(int col=j-1; col>=0; col--) {
			if(board[i][col] == true) return false;
		}
		
		//check in Up Direction
		for(int row=i-1; row>=0; row--) {
			if(board[row][j] == true) return false;
		}
		
		//check in diagonal left Direction
		for(int row=i-1, col=j-1; row>=0 && col>=0; row--, col--) {
			if(board[row][col] == true) return false;
		}
		
		//check in digonal rigth direction
		for(int row=i-1, col=j+1; row>=0 && col<board[0].length; row--, col++) {
			if(board[row][col] == true) return false;
		}
		
		return true;
	}
	
	
	
	public static void nQueenKill(boolean[][]board, int i, int j, int qpsf, int tq, String ans) {
		
		if(qpsf == tq) {
			System.out.println(ans);
			return;
		}
		if(j >= board[0].length) {
			j = 0;
			i++;
		}
		if(i >= board.length) return;
		else {
			
			//Place only if possible
			if(isItPossible(board, i, j)) {
				board[i][j] = true;
				nQueenKill(board, i, j+1, qpsf+1, tq, ans+"q"+"b"+i+j+" ");
				board[i][j] = false;
			}
			
			//Not place
			nQueenKill(board, i, j+1, qpsf, tq, ans);
			
		}
	}
	
	
	
	//n cross n ka board & n queens ------> n queens problem
	//Optimized way
	public static void nQueenOptimized(boolean[][] board, int qpsf, int tq, String ans) {
		
		if(qpsf == tq) {
			System.out.println(ans);
			return;
		}
		else {
			
			for(int j=0; j<board[0].length; j++) {
				
				//Place only if possible
				if(isItPossible(board, qpsf, j)) {
					board[qpsf][j] = true;
					nQueenOptimized(board, qpsf+1, tq, ans+"q"+"b"+qpsf+j+" ");
					board[qpsf][j] = false;
				}
				
			}
			
		}
		
	}
	
	
	
public static void nQueenKill2(boolean[][]board, int j, int qpsf, int tq, String ans) {
		
		if(qpsf == tq) {
			System.out.println(ans);
			return;
		}
		if(j >= board[0].length) {
			j = 0;
		}
		else {
			
			//Place only if possible
			if(isItPossible(board, qpsf, j)) {
				board[qpsf][j] = true;
				nQueenKill2(board, j, qpsf+1, tq, ans+"q"+"b"+j+" ");
				board[qpsf][j] = false;
			}
			
			//Not place
			nQueenKill2(board, j+1, qpsf, tq, ans);
			
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean[][] board = new boolean[4][4];
		nQueenKill(board, 0, 0, 0, 4, "");
		System.out.println("--------------------------------");
		nQueenOptimized(board,0, 4, "");
		System.out.println("--------------------------------");
		nQueenKill2(board, 0, 0, 4, "");
		
		

	}

}
