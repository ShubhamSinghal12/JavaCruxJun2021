package Lec1;

import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		System.out.println(n);
		if(n%2 == 1)
		{
			System.out.println("odd");
		}
		else
		{
			System.out.println("even");
		}
		
		

	}

}
