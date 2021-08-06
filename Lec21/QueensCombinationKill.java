package Lec21;

public class QueensCombinationKill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] board = new boolean[4][4];
//		qc(board, 0, 3, "",0,-1);
		nqueens(board, 0, 4, "");

	}
	
	public static int qc(boolean[][] board,int qpsf,int tq,String ans,int lastrow,int lastcolumn)
	{
		if(qpsf == tq)
		{
			System.out.println(ans);
			return 1;
		}
		else
		{
			int ct = 0;
			for(int i = lastrow; i< board.length;i++)
			{
				int j = 0;
				
				if(i == lastrow)
					j = lastcolumn+1;
				
				for(; j <board[i].length;j++)
				{
					if(isItPossible(board, i, j))
					{
						board[i][j] = true;
						ct += qc(board, qpsf+1, tq, ans+"q"+qpsf+" b"+i+ j+" ",i,j);
						board[i][j] = false;
					}
				}
			}
			return ct;
		}
	}
	
	public static int nqueens(boolean[][] board,int qpsf,int tq,String ans)
	{
		if(qpsf == tq)
		{
			System.out.println(ans);
			return 1;
		}
		else
		{
			int ct = 0;
			int row = qpsf;
			for(int col = 0; col < board[0].length; col++)
			{
				if(isItPossible(board, row, col))
				{
					board[row][col] = true;
					ct += nqueens(board, qpsf+1, tq, ans+"q"+qpsf+" b"+row+ col+" ");
					board[row][col] = false;
				}
			}
			return ct;
		}
	}

	
	public static boolean isItPossible(boolean[][] board,int row,int col)
	{
		for(int i = 0; i<col;i++)
		{
			if(board[row][i] == true)
			{
				return false;
			}		
		}
		
		for(int i = 0; i < row; i++)
		{
			if(board[i][col] == true)
			{
				return false;
			}
		}
		
		int i = row-1;
		int j = col-1;
		while(i>=0 && j>=0)
		{
			if(board[i][j] == true)
				return false;
			i--;
			j--;
		}
		
		i = row-1;
		j = col+1;
		while(i>=0 && j < board[0].length)
		{
			if(board[i][j] == true)
				return false;
			i--;
			j++;
		}
		return true;
		
	}
}
