package Lec13;

import java.util.Scanner;

public class StringTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int io = sc.nextInt();
		String s = sc.next();
		System.out.println(s+io);
		
		long start = System.currentTimeMillis();
		for(int i = 1; i<= 100000;i++)
			s += "a";
		long end = System.currentTimeMillis();
		System.out.println(end-start);

	}

}
