package Lec49;

import java.util.Arrays;

public class MinCostStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] costs = {1,100,1,1,1,100,1,1,100,1};
		int[] dp = new int[costs.length];
		Arrays.fill(dp, -1);
//		System.out.println(Math.min(minCostTD(costs,1,dp),minCostTD(costs,0,dp)));
		System.out.println(minCostBU(costs));
	}
	
	public static int minCost(int[] cost, int i)
	{
		if(i >= cost.length)
			return 0;
		
		int first = minCost(cost,i+1);
		int second = minCost(cost,i+2);
		
		return cost[i] + Math.min(first, second);
	}
	
	public static int minCostTD(int[] cost, int i,int[] dp)
	{
		if(i >= cost.length)
			return 0;
		
		if(dp[i] != -1)
		{
			return dp[i];
		}
		
		int first = minCost(cost,i+1);
		int second = minCost(cost,i+2);
		
		return dp[i] = cost[i] + Math.min(first, second);
	}
	
	public static int minCostBU(int[] cost)
	{
		int[] dp = new int[cost.length];
		dp[cost.length-1] = cost[cost.length-1];
		dp[cost.length-2] = cost[cost.length-2];
		
		for(int i = cost.length-3; i >= 0; i--)
		{
			dp[i] = cost[i] + Math.min(dp[i+1], dp[i+2]);
		}
		
		return Math.min(dp[0], dp[1]);
		
		
	}
	
	
	
	
	

}
