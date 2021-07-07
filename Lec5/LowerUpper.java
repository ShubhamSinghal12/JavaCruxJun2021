package Lec5;

import java.util.Scanner;

public class LowerUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(ch >= 97 && ch <= 97+26)
		{
			System.out.println("LowerCase");
		}
		else
		{
			System.out.println("UpperCase");
		}
		

	}

}
