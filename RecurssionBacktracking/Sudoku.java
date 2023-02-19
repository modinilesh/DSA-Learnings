package RecurssionBacktracking;

import java.util.Arrays;

public class Sudoku {
	
	public static boolean isItPossible(int[][] board, int val, int i, int j) {
		
		//val should not be present in that row
		for(int col=0; col<board[0].length; col++) {
			if(board[i][col] == val) return false;
		}
		
		//val should not be present in that column
		for(int row=0; row<board.length; row++) {
			if(board[row][j] == val) return false;
		}
		
		//val should not be present in that corresponding 3cross3 matrix
		int a = (i / 3) * 3;
		int b = (j / 3) * 3;
		
		//int a = i%3 - i;
		//int b = j%3 - j;
		
		for(int row=a; row < a+3 ; row++) {
			for(int col = b; col<b+3; col++) {
				if(board[row][col] == val) return false;
			}
		}
		
		return true;
		
	}
	
	
	public static void sudoku(int[][] board, int i, int j) {
		
		if(i == board.length) {
			for(int[] a : board) {
				System.out.println(Arrays.toString(a));
			}
		}
		else if(j >= board[0].length) {
			sudoku(board, i+1, 0);
		}
		else if(board[i][j] != 0) {
			sudoku(board, i, j+1);
		}
		else {
			
			for(int a = 1; a <= 9; a++) {
				if(isItPossible(board, a, i, j)) {
					board[i][j] = a;
					sudoku(board, i, j);
					board[i][j] = 0;
				}
			}
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] board = { {0, 4, 0, 0, 0, 7, 6, 0, 0},
				{8, 0, 6, 0, 4, 0, 0, 3, 0},
				{0, 2, 7, 0, 0, 0, 0, 0, 8},
				{0, 0, 0, 4, 8, 0, 0, 0, 3},
				{0, 9, 0, 7, 0, 6, 0, 4, 0},
				{2, 0, 0, 0, 1, 3, 0, 0, 0}, 
				{4, 0, 0, 0, 0, 0, 8, 1, 0},
				{0, 5, 0, 0, 3, 0, 2, 0, 4},
				{0, 0, 1, 5, 0, 0, 0, 6, 0} };
		
		for(int[] a : board) {
			System.out.println(Arrays.toString(a));
		}
			
			System.out.println("------------------------------------");
		
		
		
		sudoku(board, 0, 0);
		

	}

}

