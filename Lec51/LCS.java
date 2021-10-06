package Lec51;

import java.util.Arrays;

public class LCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s2 = "abced";
		String s1 = "ace";
		int[][] dp = new int[s1.length()+1][s2.length()+1];
		for(int[] arr: dp)
			Arrays.fill(arr, -1);
		System.out.println(lcsTD(s1,s2,0,0,dp));
		System.out.println(lcsBU(s1, s2));
		

	}
	
	public static int lcs(String s1, String s2,int m, int n)
	{
		if(m == s1.length() || n == s2.length())
			return 0;
		
		if(s1.charAt(m) == s2.charAt(n))
		{
			return 1+lcs(s1, s2, m+1, n+1);
		}
		else
		{
			return Math.max(lcs(s1, s2, m+1, n), lcs(s1, s2, m, n+1));
		}
	}
	
	
	public static int lcsTD(String s1, String s2,int m, int n,int[][] dp)
	{
		if(m == s1.length() || n == s2.length())
			return 0;
		
		if(dp[m][n] != -1)
			return dp[m][n];
		
		if(s1.charAt(m) == s2.charAt(n))
		{
			return dp[m][n] = 1+lcsTD(s1, s2, m+1, n+1,dp);
		}
		else
		{
			return dp[m][n] = Math.max(lcsTD(s1, s2, m+1, n,dp), lcsTD(s1, s2, m, n+1,dp));
		}
	}
	
	public static int lcsBU(String s1,String s2)
	{
		int[][] dp = new int[s1.length()+1][s2.length()+1];
//		for(int m = s1.length()-1; m >=0; m--)
//		{
//			for(int n = s2.length()-1; n >= 0; n--)
//			{
//				if(s1.charAt(m) == s2.charAt(n))
//				{
//					dp[m][n] = 1+dp[m+1][n+1];
//				}
//				else
//				{
//					dp[m][n] = Math.max(dp[m+1][n], dp[m][n+1]);
//				}
//			}
//		}
		for(int m = 1; m <= s1.length(); m++)
		{
			for(int n = 1; n <= s2.length(); n++)
			{
				if(s1.charAt(m-1) == s2.charAt(n-1))
				{
					dp[m][n] = 1+dp[m-1][n-1];
				}
				else
				{
					dp[m][n] = Math.max(dp[m-1][n], dp[m][n-1]);
				}
			}
		}
		return dp[s1.length()][s2.length()];
	}

}
