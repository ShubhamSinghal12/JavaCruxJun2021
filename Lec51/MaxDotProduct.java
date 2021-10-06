package Lec51;

public class MaxDotProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {2,1,-2,5};
		int[] nums2 = {3,0,-6};
		System.out.println(mdp(nums1, nums2, 0, 0));
		System.out.println(mdpBU(nums1, nums2));

	}
	
	public static int mdp(int[] num1, int[] num2,int m, int n)
	{
		if(m == num1.length || n == num2.length)
			return Integer.MIN_VALUE;
		
		int dot = num1[m]*num2[n] + Math.max(0,mdp(num1, num2, m+1, n+1));
		int fdp = mdp(num1, num2, m+1, n);
		int sdp = mdp(num1, num2, m, n+1);
		
		return Math.max(dot, Math.max(fdp, sdp));
		
	}
	
	
	public static int mdpBU(int[] nums1,int[] nums2)
	{
		int dp[][] = new int[nums1.length+1][nums2.length+1];
		for(int i = 0; i <= nums1.length;i++)
		{
			dp[i][nums2.length] = Integer.MIN_VALUE;
		}
		for(int i = 0; i <= nums2.length;i++)
		{
			dp[nums1.length][i] = Integer.MIN_VALUE;
		}
		
		
		for(int m = nums1.length-1; m >=0; m--)
			{
				for(int n = nums2.length-1; n >= 0; n--)
				{
					int dot = nums1[m]*nums2[n] + Math.max(0,dp[m+1][n+1]);
					int fdp = dp[m+1][n];
					int sdp = dp[m][n+1];
					
					dp[m][n] = Math.max(dot, Math.max(fdp, sdp));
				}
			}
		return dp[0][0];
	}

}
