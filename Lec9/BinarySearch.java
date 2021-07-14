package Lec9;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,5,6,8,10,11,13,15};
		int n = 4;
		System.out.println(binarySearch(arr, n));

	}
	
	public static int binarySearch(int[] arr,int ele)
	{
		int low = 0;
		int high = arr.length-1;
		while(low<=high)
		{
			int mid = (low+high)/2;
			if(ele == arr[mid])
			{
				return mid;
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
		return -1;
	}

}
