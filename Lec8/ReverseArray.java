package Lec8;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7};
		reversePart(arr,2,4);
		display(arr);
	}
	
	
	public static void reverse(int[] arr)
	{
		int si = 0;
		int ei = arr.length-1;
		while(si<ei)
		{
			swap2(arr, si, ei);
			si++;
			ei--;
		}
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
	
	public static int[] takeInput(int n)
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
//		sc.close();
		return arr;
	}
	
	public static void display(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void swap2(int arr[], int a, int b)
	{
		int t = arr[a];
		arr[a] = arr[b];
		arr[b] = t;
	}
	

}
