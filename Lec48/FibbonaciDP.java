package Lec48;

import java.util.Arrays;

public class FibbonaciDP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000;
//		System.out.println(fib(50));
		int[] dp = new int[n+1];
		Arrays.fill(dp, -1);
		dp[0] = 0;
		dp[1] = 1;
		System.out.println(fibTD(n,dp));
		System.out.println(fibBUSE(300000));

	}
	
	public static int fib(int n)
	{
		if(n == 0 || n == 1)
			return n;
		
		int f1 = fib(n-1);
		int f2 = fib(n-2);
		return f1+f2;
	}
	
	public static int fibTD(int n,int[] dp)
	{
		
		//Retireve
		if(dp[n] != -1)
			return dp[n];
		
		int f1 = fibTD(n-1,dp);
		int f2 = fibTD(n-2,dp);
		
		//Store
		dp[n] = f1+f2;
		
		return dp[n];
		
	}
	
	
	public static int fibBU(int n)
	{
		
		int[] dp = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		
		
		for(int i = 2; i <= n; i++)
		{
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		return dp[n];
		
	}
	
	public static int fibBUSE(int n)
	{
		int a = 0;
		int b = 1;
		int c = a+b;
		for(int i = 2; i <= n; i++)
		{
			c = a+b;
			a = b;
			b = c;
		}
		return c;
	}
	
	

}
