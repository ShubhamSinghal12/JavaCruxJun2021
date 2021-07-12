package Lec8;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,5,1};
//		System.out.println(minIndex(arr, 4));
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	public static void selectionSort(int[] arr)
	{
		for(int i = 0; i < arr.length-1; i++)
		{
			int minid = minIndex(arr, i);
			swap2(arr, i, minid);
		}
	}
	public static void swap2(int arr[], int a, int b)
	{
		int t = arr[a];
		arr[a] = arr[b];
		arr[b] = t;
	}
	
	public static int minIndex(int[] arr, int id)
	{
		int minid = id;
		for(int i = id+1; i < arr.length; i++)
		{
			if(arr[minid] > arr[i])//if(min>arr[i])
			{
				minid = i;
			}
		}
		return minid;
	}
	
	

}
