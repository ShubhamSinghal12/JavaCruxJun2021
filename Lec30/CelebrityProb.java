package Lec30;

import java.util.Stack;

public class CelebrityProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { {0, 0, 1, 0},
		           {0, 0, 1, 0},
		           {0, 1, 0, 0},
		           {0, 0, 1, 0} };
		
		celeb(arr);
		

	}
	
	public static void celeb(int[][] arr)
	{
		Stack<Integer> st = new Stack<Integer>();
		for(int i = 0; i < arr.length; i++)
			st.push(i);
		
		while(st.size() != 1)
		{
			int a = st.pop();
			int b = st.pop();
			if(arr[a][b] == 1)
			{
				st.push(b);
			}
			else
			{
				st.push(a);
			}
		}
		
		int cand = st.pop();
		boolean flag = true;
		for(int  i = 0 ; i < arr.length; i++)
		{
			if(i != cand)
			{
				if(arr[i][cand] == 0 || arr[cand][i] == 1)
				{
					System.out.println("No celeb");
					flag = false;
					break;
				}
			}
		}
		if(flag)
			System.out.println("Celebrity: "+ cand);
		
		
		
		
		
	}

}
