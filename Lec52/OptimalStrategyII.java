package Lec52;

public class OptimalStrategyII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int coins[] = {8, 15, 3, 7};
		System.out.println(ops(coins, 0, coins.length-1));
		int[][] dp = new int[coins.length][coins.length];
		System.out.println(opsTD(coins, 0, coins.length-1, dp));

	}
	
	public static int ops(int[] coins, int i, int j)
	{
		if(i > j)
			return 0;
		if(i+1 == j)
			return Math.max(coins[i], coins[j]);
		
		int first = coins[i] + Math.min(ops(coins, i+2, j), ops(coins, i+1, j-1));
		int last = coins[j] + Math.min(ops(coins, i+1, j-1), ops(coins, i, j-2));
		
		return Math.max(first, last);		
		
	}
	
	
	public static int opsTD(int[] coins, int i, int j,int[][] dp)
	{
		if(i > j)
			return 0;
		if(i+1 == j)
			return Math.max(coins[i], coins[j]);
		if(dp[i][j] != 0)
			return dp[i][j];
		
		int first = coins[i] + Math.min(opsTD(coins, i+2, j,dp), opsTD(coins, i+1, j-1,dp));
		int last = coins[j] + Math.min(opsTD(coins, i+1, j-1,dp), opsTD(coins, i, j-2,dp));
		
		return dp[i][j] = Math.max(first, last);		
		
	}
	
	
	
	
	
	

}
