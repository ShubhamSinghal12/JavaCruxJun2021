package Lec20;

public class QueenBoardRespect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] board = new boolean[4];
		qc(board, 0, 2, "", 0);
	}
	
	public static void qc(boolean[] board,int qpsf,int tq,String ans,int pos)
	{
		if(qpsf == tq)
		{
			System.out.println(ans);
			return;
		}
		if(pos == board.length)
		{
			return;
		}
		else
		{
			//Place
			board[pos] = true;
			qc(board, qpsf+1, tq, ans+"b"+pos+" ", pos+1);
			board[pos] = false;
			
			//Not Placed
			qc(board, qpsf, tq, ans, pos+1);
		}
	}

}
