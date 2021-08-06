package Lec21;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int k = 2;
		List<Integer> al = new ArrayList<>();
		List<List<Integer>> Bigans = new ArrayList<>();
		qc(n, 0, k, al, 0,Bigans);
		System.out.println(Bigans);

	}
	
	public static void qc(int board,int qpsf,int tq,List<Integer> ans,int pos,List<List<Integer>> Bigans)
	{
		if(qpsf == tq)
		{
			Bigans.add(new ArrayList<>(ans));
			return;
		}
		if(pos == board)
		{
			return;
		}
		else
		{
			//Place
			ans.add(pos+1);
			qc(board, qpsf+1, tq, ans, pos+1,Bigans);
			ans.remove(ans.size()-1);
			
			//Not Placed
			qc(board, qpsf, tq, ans, pos+1,Bigans);
		}
	}

}
