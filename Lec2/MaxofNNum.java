package Lec2;

import java.util.Scanner;

public class MaxofNNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		int n = 5;
		int i = 1;
		while(i <= n)
		{
			int num = sc.nextInt();
			if(num > max)
			{
				max = num;
			}
			i++;
		}
		System.out.println(max);

	}

}
