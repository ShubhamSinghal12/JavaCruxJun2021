package Lec11;

import java.util.Scanner;

public class Arrays2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = new int[3][2];
		
		Scanner sc = new Scanner(System.in);
		System.out.println(arr);
		System.out.println(arr[0]);
//		arr[0] = new int[3];
		System.out.println(arr[0]);
		System.out.println(arr[0][0]);
		System.out.println(arr.length);
		System.out.println(arr[0].length);
//		
//		for(int i = 0; i < arr.length; i++)
//		{
//			for(int j = 0; j < arr[0].length; j++)
//			{
//				arr[i][j] = sc.nextInt();
//			}
//		}
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[0].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("-------");
		
		int [][] brr = {{1,2,3},{4,5}};
		
		for(int[] val : brr)
		{
			for(int i: val)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		int[] ar = new int[5];
		System.out.println(ar);
		ar = new int[10];
		System.out.println(ar);
		
		
		

	}

}
