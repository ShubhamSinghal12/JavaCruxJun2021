package Lec14;

//import java.util.Scanner;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		sc.nextLine();
//		String s = sc.nextLine();
////		int  n = sc.nextInt();
//		System.out.println(n+" "+s);
		
		String s = "Hello";
		StringBuilder sb = new StringBuilder(s);
		StringBuilder sb1 = sb;
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.charAt(2));
		
		sb.append(" bye");
		System.out.println(sb1);
		
		sb.insert(1, 12);
		System.out.println(sb1);
		
		sb.setCharAt(1, 'e');
		System.out.println(sb1);
		
		sb.deleteCharAt(1);
		System.out.println(sb1);
		
		sb.delete(1, 4);
		System.out.println(sb1);
		
		String s1 = sb.substring(1, 5);
		System.out.println(s1);
		
		String s2 = sb.toString();
		System.out.println(s2);
		
		long start = System.currentTimeMillis();
		for(int i = 1; i<= 100000;i++)
			sb.append("a");
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		

	}

}
