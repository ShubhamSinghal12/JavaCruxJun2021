package Lec13;

import java.util.Scanner;

public class StringSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
//		printSubstring(s);
//		System.out.println(isPalindrome("niti"));
//		System.out.println(reverse(s));
//		System.out.println(countPalindromicSubstring("nitin"));
		System.out.println(reverseByWords2(s));
		
		
	}
	
	
	public static void printSubstring(String s)
	{
		for(int i = 0; i<s.length();i++)
		{
			for(int j = i+1; j <= s.length();j++)
			{
				System.out.println(s.substring(i,j));
			}
		}
	}
	public static int countPalindromicSubstring(String s)
	{
		int count = 0;
		for(int i = 0; i<s.length();i++)
		{
			for(int j = i+1; j <= s.length();j++)
			{
				if(isPalindrome(s.substring(i,j)))
				{
					count++;
				}
			}
		}
		return count;
	}
	
	public static String reverse(String s)
	{
		String ans = "";
		
		for(int j = s.length()-1; j >= 0; j--)
		{
			ans += s.charAt(j);
		}
		return ans;
	}
	
	public static boolean isPalindrome2(String s)
	{
		String r = reverse(s);
		return r.equals(s);
	}
	
	public static boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length()-1;
		while(i<j)
		{
			if(s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
	
	public static String reverseByWords(String s)
	{
		String ans = "";
		int j = s.lastIndexOf(' ');
		
		while(j>=0)
		{
			ans = ans + s.substring(j+1)+" ";
			s = s.substring(0,j);
			
			j = s.lastIndexOf(' ');
		}
		ans = ans + s.substring(0);
		
		return ans;
	}
	
	public static String reverseByWords2(String s)
	{
		String rs[] = s.split(" *");
//		System.out.println(rs[0]);
		String ans = "";
		for(int i = rs.length-1; i>=0;i--)
		{
			ans += rs[i]+" ";
		}
		return ans;
	}

}
