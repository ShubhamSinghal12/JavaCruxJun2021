package Lec2;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1;
		while(n/10 != 0)
		{
			n = n/10;
			++count;
		}
		
		System.out.println(count);
	}

}
