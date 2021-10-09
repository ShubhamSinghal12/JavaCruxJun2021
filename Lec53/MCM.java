package Lec53;

public class MCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mc[] = {10,30,5,60};
		System.out.println(mcm(mc,0,mc.length-1));
		System.out.println(mcmBU(mc));

	}
	
	public static int mcm(int[] mc, int si, int ei)
	{
		if(si+1== ei)
			return 0;
		else
		{
			int ans = Integer.MAX_VALUE;
			for(int k = si+1; k < ei;k++)
			{
				int fm = mcm(mc, si, k);
				int sm = mcm(mc, k, ei);
				int self = mc[si]*mc[k]*mc[ei];
				
				ans = Math.min(ans, self+fm+sm);
			}
			return ans;
		}
	}
	public static int mcm(int[] mc, int si, int ei,int[][] dp)
	{
		if(si+1== ei)
			return 0;
		else
		{
			if(dp[si][ei] != -1)
				return dp[si][ei];
			int ans = Integer.MAX_VALUE;
			for(int k = si+1; k < ei;k++)
			{
				int fm = mcm(mc, si, k,dp);
				int sm = mcm(mc, k, ei,dp);
				int self = mc[si]*mc[k]*mc[ei];
				
				ans = Math.min(ans, self+fm+sm);
			}
			return dp[si][ei] = ans;
		}
	}
	
	public static int mcmBU(int[] mc)
	{
		int[][] dp = new int[mc.length][mc.length];
		
		for(int si = 0; si<mc.length-1;si++)
			dp[si][si+1] = 0;
		
		for(int si = mc.length-2; si >= 0; si--)
		{
			for(int ei = si+2; ei < mc.length ;ei++)
			{
				int ans = Integer.MAX_VALUE;
				for(int k = si+1; k < ei;k++)
				{
					int fm = dp[si][k];
					int sm = dp[k][ei];
					int self = mc[si]*mc[k]*mc[ei];
					
					ans = Math.min(ans, self+fm+sm);
				}
				dp[si][ei] = ans;
			}
		}
		
		return dp[0][mc.length-1];
		
	}
	
	
	

}
