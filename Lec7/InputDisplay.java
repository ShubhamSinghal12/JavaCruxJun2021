package Lec7;

import java.util.Scanner;

public class InputDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = takeInput(5);
		display(arr);
		System.out.println(arr[0]);
	}
	
	public static int[] takeInput(int n)
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		return arr;
	}
	
	public static void display(int[] arr)
	{
		arr[0] = 100;
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	
	
	
	

}
