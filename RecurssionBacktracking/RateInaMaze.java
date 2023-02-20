package RecurssionBacktracking;


public class RateInaMaze {

    public static void mazePath(int[][] board, int i, int j,String ans){

        if(i == board.length-1 && j == board[0].length-1){
            System.out.println(ans);
        }
        else if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] == 0  ) return ;
        else {
			
        	 board[i][j] = 0;
 			 mazePath(board, i+1, j, ans+"D");
             board[i][j] = 1;
             
             board[i][j] = 0;
             mazePath(board, i, j-1, ans+"L");
             board[i][j] = 1;
             
             board[i][j] = 0;
 			 mazePath(board, i, j+1, ans+"R");
             board[i][j] = 1;

             board[i][j] = 0;
             mazePath(board, i-1, j, ans+"U");
             board[i][j] = 1;
			
		}

    }

	
    public static void main(String args[]) {

    	int[][] board = {{1,1,1},{1,0,1},{1,1,1}};
    	
    	mazePath(board, 0, 0, "") ;
    }

}