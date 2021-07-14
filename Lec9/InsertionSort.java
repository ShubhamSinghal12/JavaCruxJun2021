package Lec9;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,5,3,4};
//		insert(arr, arr.length-1);
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void insertionSort(int[] arr)
	{
		for(int i  = 1; i < arr.length; i++)
		{
			insert(arr, i);
		}
	}
	
	public static void insert(int[] arr, int n)
	{
		int pos = 0;
		int temp = arr[n];
		for(int i = n-1; i >= 0; i--)
		{
			if(arr[i] < temp)
			{
				pos = i+1;
				break;
			}
			else
			{
				arr[i+1] = arr[i];
			}
		}
		arr[pos] = temp;
	}

}
