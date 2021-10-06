package Lec51;

import java.util.Arrays;

public class DistinctSubsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "rabbbit";
		String s2 = "rabbit";
		int[][] dp = new int[s2.length()+1][s1.length()+1];
		for(int[] arr:dp)
			Arrays.fill(arr, -1);
		System.out.println(ccTD(s1, 0, s2, 0 ,dp));
		
//		for(int[] arr:dp)
//			System.out.println(Arrays.toString(arr));
		

	}
	
	public static int ccTD(String s1, int m,String s2,int n,int[][] dp)
	{
		if(n == s2.length())
		{
			return 1;
		}
		if(m == s1.length())
			return 0;
		
		
		if(dp[n][m] != -1)
			return dp[n][m];
		
		int inc = 0;
		int exc = 0;
		
		if( s1.charAt(m) == s2.charAt(n))
		{
			inc = ccTD(s1,m+1,s2,n+1,dp);
		}
		
		exc = ccTD(s1,m+1,s2,n,dp);
		dp[n][m] = inc+exc;
		
		return dp[n][m];
		
	}

}
