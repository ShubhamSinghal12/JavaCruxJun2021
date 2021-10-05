package Lec50;

import java.util.Arrays;

public class CoinChange2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins  = {1,2,5};
		int amount = 5;
//		int[][] dp = new int[amount+1][coins.length+1];
//		for(int[] arr:dp)
//			Arrays.fill(arr, -1);
//		System.out.println(ccTD(coins, 0, amount,dp));
//		
//		for(int[] arr:dp)
//			System.out.println(Arrays.toString(arr));
		System.out.println(ccBU(coins, amount));

	}
	
	public static int cc(int[] coins, int i,int amount)
	{
		if(amount == 0)
		{
			return 1;
		}
		if(i >= coins.length)
			return 0;
		
		
		int inc = 0;
		int exc = 0;
		
		if(coins[i] <= amount)
		{
			inc = cc(coins,i,amount-coins[i]);
		}
		exc = cc(coins,i+1,amount);
		return inc+exc;
		
	}
	
	public static int ccTD(int[] coins, int i,int amount,int[][] dp)
	{
		if(amount == 0)
		{
			return 1;
		}
		if(i >= coins.length)
			return 0;
		
		
		if(dp[amount][i] != -1)
			return dp[amount][i];
		
		int inc = 0;
		int exc = 0;
		
		if(coins[i] <= amount)
		{
			inc = ccTD(coins,i,amount-coins[i],dp);
		}
		
		exc = ccTD(coins,i+1,amount,dp);
		dp[amount][i] = inc+exc;
		
		return dp[amount][i];
		
	}
	
	public static int ccBU(int[] coins,int amount)
	{
		int[][] dp = new int[amount+1][coins.length+1];
		for(int i = 0; i < coins.length; i++)
			dp[0][i] = 1;
		
		
		for(int amt = 1; amt <= amount; amt++)
		{
			for(int i = coins.length-1; i>= 0; i--)
			{
				int inc = 0;
				int exc = 0;
				if(coins[i] <= amt)
				{
					inc = dp[amt-coins[i]][i];
				}
				
				exc = dp[amt][i+1];
				dp[amt][i] = inc+exc;
			}
		}
		for(int[] arr:dp)
			System.out.println(Arrays.toString(arr));
		
		return dp[amount][0];
		
	}
	
	

}
