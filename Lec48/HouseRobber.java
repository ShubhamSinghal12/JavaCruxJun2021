package Lec48;

import java.util.Arrays;

public class HouseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,1,1,10}; 
		int[] dp = new int[nums.length];
		Arrays.fill(dp, -1);
//		System.out.println(robTD(nums,0,dp));
//		System.out.println(rob2(nums,nums.length-1));
		System.out.println(robBU3(nums));

	}
	
	public static int rob(int[] nums,int i) {
        
		
		if(i >= nums.length)
			return 0;
		
		int r = nums[i]+rob(nums,i+2);
		int nr = rob(nums,i+1);
		
		return Math.max(r, nr);
		
		
    }
	
	public static int robTD(int[] nums,int i,int[] dp) {
        
		
		if(i >= nums.length)
			return 0;
		
		if(dp[i] != -1)
			return dp[i];
		
		int r = nums[i]+robTD(nums,i+2,dp);
		int nr = robTD(nums,i+1,dp);
		
		dp[i] =  Math.max(r, nr);
		return dp[i];
			
    }
	
	public static int robBU(int[] nums)
	{
		int[] dp = new int[nums.length+2];
		dp[dp.length-1] = 0;
		dp[dp.length-2] = 0;
		for(int i = nums.length-1; i >= 0; i--)
		{
			dp[i] = Math.max(dp[i+1], nums[i]+dp[i+2]);
		}
		return dp[0];
	}
	
	
	public static int rob2(int[] nums,int i) {
        
		
		if(i <= -1)
			return 0;
		
		int r = nums[i]+rob2(nums,i-2);
		int nr = rob2(nums,i-1);
		
		return Math.max(r, nr);
		
		
    }
	
	public static int robTD2(int[] nums,int i,int[] dp) {
        
		
		if(i <= -1)
			return 0;
		
		if(dp[i] != -1)
			return dp[i];
		
		int r = nums[i]+robTD2(nums,i-2,dp);
		int nr = robTD2(nums,i-1,dp);
		
		dp[i] =  Math.max(r, nr);
		return dp[i];
			
    }
//	
	public static int robBU2(int[] nums)
	{
		int[] dp = new int[nums.length+2];
		dp[0] = 0;
		dp[1] = 0;
		
		for(int i = 2; i <= nums.length+1; i++)
		{
			dp[i] = Math.max(dp[i-1], nums[i-2]+dp[i-2]);
		}
		
		return dp[dp.length-1];
	}
	
	public static int robBU3(int[] nums)
	{
		int[] dp = new int[nums.length];
		
		dp[0] = nums[0];
		dp[1] = Math.max(nums[0], nums[1]);
		
		for(int i = 2; i <= nums.length-1; i++)
		{
			dp[i] = Math.max(dp[i-1], nums[i]+dp[i-2]);
		}
		
		return dp[dp.length-1];
	}
	

}
