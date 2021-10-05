package Lec50;

import java.util.Arrays;

public class KnapSack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] wt = {1 ,2 ,3 ,2 ,2};
		int[] cost = {8 ,4 ,0 ,5 ,3};
		int cap = 4;
		int[][] dp = new int [cap+1][cost.length+1];
		for(int[] arr:dp)
			Arrays.fill(arr, -1);
		System.out.println(knsTD(wt, cost, 0, 4,dp));
		
	}
	
	public static int kns(int[] wt,int[] cost,int i,int cap)
	{
		if(i >= wt.length || cap == 0)
			return 0;
		
		int inc = 0;
		int exc = 0;
		if(wt[i] <= cap)
		{
			inc = cost[i] + kns(wt,cost,i+1,cap-wt[i]);
		}
		exc = kns(wt,cost,i+1,cap);
		
		return Math.max(inc, exc);
	}
	
	public static int knsTD(int[] wt,int[] cost,int i,int cap,int[][] dp)
	{
		if(i >= wt.length || cap == 0)
			return 0;
		
		if(dp[cap][i] != -1)
			return dp[cap][i];
		int inc = 0;
		int exc = 0;
		if(wt[i] <= cap)
		{
			inc = cost[i] + knsTD(wt,cost,i+1,cap-wt[i],dp);
		}
		exc = knsTD(wt,cost,i+1,cap,dp);
		
		return dp[cap][i] = Math.max(inc, exc);
	}
	
	
	

}
