package Lec23;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {4,2,6,7,3,8,5};
//		partition(arr, 0, arr.length-1);
		qs(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));

	}
	public static void qs(int[] arr,int si,int ei)
	{
		if(si >= ei)
		{
			return;
		}
		int pi = partition(arr, si, ei);
		qs(arr,si,pi-1);
		qs(arr,pi+1,ei);
	}
	public static int partition(int[] arr,int si,int ei)
	{
		int pivot = arr[ei];
		int j = si;
		for(int i = si; i < ei; i++)
		{
			if(arr[i]<pivot)
			{
				int t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
				
				j++;
			}
		}
		
		int t = arr[ei];
		arr[ei] = arr[j];
		arr[j] = t;
		
		return j;
	}
	
}
