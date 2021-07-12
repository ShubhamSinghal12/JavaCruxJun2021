package Lec8;

import java.util.Arrays;

public class Rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5};
		rotateN(arr,2);
		System.out.println(Arrays.toString(arr));
		

	}
	
	public static void rotate1(int[] arr)
	{
		int temp = arr[arr.length-1];
		for(int i = arr.length-1; i >= 1;i--)
		{
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
	}
	
	public static void rotateN(int[] arr,int n)
	{	
		for(int i = 1; i <= n; i++)
		{
			rotate1(arr);
		}
	}
	
	

}
