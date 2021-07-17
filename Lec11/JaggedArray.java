package Lec11;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = new int[3][];
		Scanner sc = new Scanner(System.in);
		arr[0] = new int[4];
		arr[1] = new int[2];
		arr[2] = new int[3];
		
//		System.out.println(arr[1][2]);
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print("Enter next row size: ");
			int n = sc.nextInt();
			arr[i] = new int[n];
			for(int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int[] val : arr)
		{
			for(int i: val)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
