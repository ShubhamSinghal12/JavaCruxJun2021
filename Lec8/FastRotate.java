package Lec8;

import java.util.Arrays;

public class FastRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		fastRotate(arr,3);
		System.out.println(Arrays.toString(arr));

	}
	public static void fastRotate(int[] arr,int x)
	{	
		reversePart(arr, 0, arr.length-1);

		reversePart(arr, 0, x-1);//Y reverse
		reversePart(arr, x, arr.length-1);//X reverse
		
	}
	
	public static void reversePart(int[] arr,int si,int ei)
	{
		while(si<ei)
		{
			swap2(arr, si, ei);
			si++;
			ei--;
		}
	}
	public static void swap2(int arr[], int a, int b)
	{
		int t = arr[a];
		arr[a] = arr[b];
		arr[b] = t;
	}
	

}
