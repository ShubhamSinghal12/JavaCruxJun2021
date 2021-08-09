package Lec22;

import java.util.Arrays;

public class Sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { {3, 0, 6, 5, 0, 8, 4, 0, 0}, 
		         {5, 2, 0, 0, 0, 0, 0, 0, 0}, 
		         {0, 8, 7, 0, 0, 0, 0, 3, 1}, 
		         {0, 0, 3, 0, 1, 0, 0, 8, 0}, 
		         {9, 0, 0, 8, 6, 3, 0, 0, 5}, 
		         {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
		         {1, 3, 0, 0, 0, 0, 2, 5, 0}, 
		         {0, 0, 0, 0, 0, 0, 0, 7, 4}, 
		         {0, 0, 5, 2, 0, 6, 3, 0, 0} };
		
		sudoku(grid, 0, 0);
		
	}
	
	public static void sudoku(int[][] board,int row,int col) {
		
		if(col>=board[0].length)
		{
//			sudoku(board, row+1, 0);
			row++;
			col = 0;
		}
		if(row>=board.length)
		{
			for(int[] a:board)
			{
				System.out.println(Arrays.toString(a));
			}
			return;
		}
		
		if(board[row][col] == 0)
		{
			for(int i = 1;i <= 9;i++)
			{
				if(isItPossible(board,row,col,i)) {
					board[row][col] = i;
					sudoku(board, row, col+1);
					board[row][col] = 0;
				}
			}
		}
		else
		{
			sudoku(board, row, col+1);
		}
		
	}
	
	public static boolean isItPossible(int[][] board,int row,int col,int val) {
		
		for(int i = 0; i<board.length;i++)
		{
			if(board[i][col]==val)
				return false;
		}
		
		for(int i = 0; i<board[0].length;i++)
		{
			if(board[row][i]==val)
				return false;
		}
		
		int x = row-row%3;
		int y = col-col%3;
		
		for(int i = x; i<x+3;i++)
		{
			for(int j = y; j<y+3;j++)
			{
				if(board[i][j] == val)
					return false;
			}
		}
		return true;
		
		
	}
	
	

}
