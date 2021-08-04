package Lec20;

public class QueenPermutationCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] board = new boolean[4];
//		System.out.println(qpc(board, 0, 2, "",-1));
//		System.out.println(qpc2(4, 0, 2, "",-1));
		System.out.println(qp(board, 0, 2, ""));
		
	}
	
	public static int qp(boolean[] board,int qpsf,int tq,String ans)
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
				if(board[i] == false)
				{
					board[i] = true;
					ct += qp(board, qpsf+1, tq, ans+"q"+qpsf+" b"+i+ " ");
					board[i] = false;
				}
			}
			return ct;
		}
	}
	public static int qpc(boolean[] board,int qpsf,int tq,String ans,int lastPlaced)
	{
		if(qpsf == tq)
		{
			System.out.println(ans);
			return 1;
		}
		else
		{
			int ct = 0;
			for(int i = lastPlaced+1; i< board.length;i++)
			{
				if(board[i] == false)
				{
					board[i] = true;
					ct += qpc(board, qpsf+1, tq, ans+"q"+qpsf+" b"+i+ " ",i);
					board[i] = false;
				}
			}
			return ct;
		}
	}
	public static int qpc2(int board,int qpsf,int tq,String ans,int lastPlaced)
	{
		if(qpsf == tq)
		{
			System.out.println(ans);
			return 1;
		}
		else
		{
			int ct = 0;
			for(int i = lastPlaced+1; i < board;i++)
			{
				ct += qpc2(board, qpsf+1, tq, ans+"q"+qpsf+" b"+i+ " ",i);
			}
			return ct;
		}
	}
	
}
