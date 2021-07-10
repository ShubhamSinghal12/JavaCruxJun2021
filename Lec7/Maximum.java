package Lec7;

public class Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {23,12,4,3,2,5,343};
		System.out.println(maximum(arr));
		System.out.println(search(arr,1));

	}
	
	public static int search(int[] arr, int ele)
	{
		int ans = -1;
//		int max = Integer.MIN_VALUE;
		for(int i = 0 ; i< arr.length; i++)
		{
			if(arr[i] == ele)
			{
				ans = i;
				return i;
//				break;
			}
		}
		return ans;
	}
	public static int maximum(int[] arr)
	{
		int max = arr[0];
		for(int val : arr)
		{
//			if(max < val)
//			{
//				max = val;
//			}
			max = Math.max(max, val);
		}
		return max;
	}
	
	

}
