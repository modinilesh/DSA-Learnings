package Assignments;


import java.util.*;
public class RateChasesCheese {


    public static boolean mazePath(char[][] board, int i, int j, int[][] grid, int ans[][]){

        if(i == board.length-1 && j == board[0].length-1){
        	grid[i][j] = 1;
        	for(int a=0; a<ans.length; a++) {
        		for(int b=0; b<ans[0].length; b++) {
        			ans[a][b] = grid[a][b];
        		}
        	}
        	
        	return true;
        } 
        else if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] == 'X'  ) return false;
        else {
                boolean a = false;

	        	board[i][j] = 'X';
	            grid[i][j] = 1;
	 			a = a ||  mazePath(board, i+1, j, grid,ans);
	             
	            a = a ||  mazePath(board, i, j-1, grid,ans);
	             
	 			a = a ||  mazePath(board, i, j+1, grid,ans);
	             
	            a = a ||  mazePath(board, i-1, j, grid,ans);
	             grid[i][j] = 0;
	             board[i][j] = 'O';
			
			return a;
			
		}

    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        char[][] board = new char[n][m];
        for(int i=0; i<n; i++){ 
            String str = sc.next() ;
            for(int j=0; j<m; j++){
                board[i][j] = str.charAt(j);
            }
        }
        
//        for(char[] a : board) {
//        	System.out.println(Arrays.toString(a));
//        }
        

        int[][] grid = new int[n][m];
        int ans [][] = new int[n][m];
   
        if(mazePath(board, 0, 0, grid,ans)) {
            for(int i=0; i<grid.length; i++){
                for(int j=0; j<grid[0].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
        else System.out.println("NO PATH FOUND");




    }
}