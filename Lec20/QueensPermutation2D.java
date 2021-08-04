package Lec20;

public class QueensPermutation2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] board = new boolean[2][3];
		qc(board, 0, 2, "",0,-1);
		
	}
	
	public static int qp(boolean[][] board,int qpsf,int tq,String ans)
	{
		if(qpsf == tq)
		{
			System.out.println(ans);
			return 1;
		}
		else
		{
			int ct = 0;
			for(int i = 0; i< board.length;i++)
			{
				for(int j = 0; j <board[i].length;j++)
				if(board[i][j] == false)
				{
					board[i][j] = true;
					ct += qp(board, qpsf+1, tq, ans+"q"+qpsf+" b"+i+ j+" ");
					board[i][j] = false;
				}
			}
			return ct;
		}
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
				else
					j = 0;
				
				for(; j <board[i].length;j++)
				if(board[i][j] == false)
				{
					board[i][j] = true;
					ct += qc(board, qpsf+1, tq, ans+"q"+qpsf+" b"+i+ j+" ",i,j);
					board[i][j] = false;
				}
			}
			return ct;
		}
	}

}
