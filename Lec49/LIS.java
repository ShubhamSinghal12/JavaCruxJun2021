package Lec49;

public class LIS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {10,9,2,5,3,7,101,18,1};
//		int max = 0;
//		for(int i = 0;i<nums.length;i++)
//			max = Math.max(max, lis(nums,i));
		
		System.out.println(lisBU(nums));

	}
	
	public static int lis(int[] nums,int i)
	{
		int max = 0;
		for(int x = 0; x < i; x++)
		{
			if(nums[i] > nums[x])
				max = Math.max(max, lis(nums,x));
		}
		return max+1;
	}
	
	public static int lisBU(int[] nums)
	{
		int[] dp = new int[nums.length];
		
		for(int i = 0; i < nums.length; i++)
		{
			int max = 0;
			for(int j = 0; j < i; j++)
			{
				if(nums[i] > nums[j])
					max = Math.max(max, dp[j]);
			}
			dp[i] = max+1;
		}
		int max = 0;
		for(int i = 0;i<nums.length;i++)
			max = Math.max(max, dp[i]);
		
		return max;
		
	}

}
