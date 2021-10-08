package Lec52;

import java.util.Arrays;

public class WineProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,6,2,5};
		int y = 1;
		System.out.println(wp(arr, 0, arr.length-1, 1));
		
		int[][] dp = new int[arr.length][arr.length];
		for(int[] arr1: dp)
			Arrays.fill(arr1, -1);
		System.out.println(wpTD(arr, 0, arr.length-1, 1, dp));
		System.out.println(wpBU(arr));
		

	}
	
	public static int wp(int[] cost,int i,int j,int y)
	{
		if(i > j)
			return 0;
		if(i == j)
			return y*cost[i];
		
		
		int first = y*cost[i] + wp(cost, i+1, j, y+1);
		int last = y*cost[j] + wp(cost,i,j-1,y+1);
		
		return Math.max(first, last);
	}
	
	public static int wpTD(int[] cost,int i,int j,int y,int[][] dp)
	{
		if(i > j)
			return 0;
		if(i == j)
			return y*cost[i];
		
		if(dp[i][j] != -1)
			return dp[i][j];
		
		int first = y*cost[i] + wpTD(cost, i+1, j, y+1,dp);
		int last = y*cost[j] + wpTD(cost,i,j-1,y+1,dp);
		
		return dp[i][j] = Math.max(first, last);
	}
	
	public static int wpBU(int[] cost)
	{
		int[][] dp = new int[cost.length][cost.length];
		for(int i = 0; i < cost.length; i++)
			dp[i][i] = cost.length*cost[i];
		
		
		for(int i = cost.length-2; i >= 0; i--)
		{
			for(int j = i+1; j < cost.length; j++)
			{
				int y = cost.length-(j-i);
				int first = y*cost[i] + dp[i+1][j];
				int last = y*cost[j] + dp[i][j-1];
				
				dp[i][j] = Math.max(first, last);
			}
		}
		
		return dp[0][cost.length-1];
	}

}
