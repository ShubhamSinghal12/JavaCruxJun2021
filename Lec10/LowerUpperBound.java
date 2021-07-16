package Lec10;

public class LowerUpperBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,2,2,2,2,4,4,5,5,6,7,7,8};
		System.out.println(LowerBound(arr, 2));
	}
	
	public static int LowerBound(int[] arr,int ele)
	{
		int low = 0;
		int high = arr.length-1;
		int ans = -1;
		while(low<=high)
		{
			int mid = (low+high)/2;
			if(ele == arr[mid])
			{
				ans = mid;
				high = mid-1;
			}
			else if(ele > arr[mid])
			{
				low = mid+1;
			}
			else
			{
				high = mid-1;
			}
		}
		return ans;
	}
	public static int UpperBound(int[] arr,int ele)
	{
		int low = 0;
		int high = arr.length-1;
		int ans = -1;
		while(low<=high)
		{
			int mid = (low+high)/2;
			if(ele == arr[mid])
			{
				ans = mid;
				low = mid+1;
			}
			else if(ele > arr[mid])
			{
				low = mid+1;
			}
			else
			{
				high = mid-1;
			}
		}
		return ans;
	}

}
