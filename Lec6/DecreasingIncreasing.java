package Lec6;

import java.util.Scanner;

public class DecreasingIncreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nn = sc.nextInt();
		int prev = nn;
		boolean DI = true;
		boolean flag = true;
		for(int i = 1; i < n ;i++)
		{
			nn = sc.nextInt();
			if(nn < prev && DI == true)
			{
				prev = nn;
//				continue;
			}
			else if(nn > prev)
			{
				prev = nn;
				DI = false;
			}
			else
			{
				flag = false;
				break;
			}
		}
		System.out.println(flag);
		

	}

}
