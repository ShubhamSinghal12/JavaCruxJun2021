package DoubtClass1;

public class VivekLovesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,1,0,1,1,0,1};
		System.out.println(game(arr,0,arr.length-1));

	}
	
	public static int sum(int[] arr,int i,int j)
	{
		int sum = 0;
		for(int k = i; k<=j ;k++)
		{
			sum+=arr[k];
		}
		return sum;
	}
	
	public static int game(int[] arr,int l,int r)
	{
		if(l>=r)
		{
			return 0;
		}
		else
		{
			int ans = 0;
			for(int i = l; i < r; i++)
			{
				int sum1 = sum(arr,l,i);
				int sum2 = sum(arr,i+1,r);
				if(sum1 == sum2)
				{
					ans = 1+Math.max(game(arr,l,i), game(arr,i+1,r));
				}
			}
			return ans;	
		}
	}
	

}
