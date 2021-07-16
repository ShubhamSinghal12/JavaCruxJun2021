package Lec10;

public class SubArraysMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,-10,4,5,-7};
		printSubArray(arr);
		System.out.println("--------------");
		System.out.println(MaxSubArraySum2(arr));
		System.out.println(Kadaens(arr));

	}
	
	public static void printSubArray(int[] arr)
	{
		for(int i = 0; i <= arr.length-1; i++)
		{
			for(int j = i; j <= arr.length-1; j++)
			{
				for(int k = i;k <= j; k++)
				{
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
		}
	}
	
	public static int MaxSubArraySum(int[] arr)
	{
		int maxsum = Integer.MIN_VALUE;
		for(int i = 0; i <= arr.length-1; i++)
		{
			for(int j = i; j <= arr.length-1; j++)
			{
				int sum = 0;
				for(int k = i;k <= j; k++)
				{
					sum += arr[k];
				}
				maxsum = Math.max(sum, maxsum);
			}
		}
		return maxsum;
	}
	
	public static int MaxSubArraySum2(int[] arr)
	{
		int maxsum = Integer.MIN_VALUE;
		for(int i = 0; i <= arr.length-1; i++)
		{
			int sum = 0;
			for(int j = i; j <= arr.length-1; j++)
			{
				sum += arr[j];
				maxsum = Math.max(sum, maxsum);
			}
		}
		return maxsum;
	}
	
	public static int Kadaens(int[] arr)
	{
		int maxsum = Integer.MIN_VALUE;
		int sum = 0;
		for(int i = 0; i <= arr.length-1; i++)
		{
			sum += arr[i];
			maxsum = Math.max(sum, maxsum);
			if(sum < 0)
			{
				sum = 0;
				
			}
		}
		return maxsum;
	}
	
	
	
	

}
