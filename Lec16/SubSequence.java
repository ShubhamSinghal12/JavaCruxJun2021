package Lec16;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(ss1("abc"));
//		ss2("abc","");
		System.out.println(Asciiss("abc",""));
		
	}
	
	public static ArrayList<String> ss1(String st)
	{
		if(st.length()==0)
		{
			return new ArrayList<String>(Arrays.asList(""));
		}
		else
		{
			char ch  = st.charAt(0);
			ArrayList<String> rr = ss1(st.substring(1));
			ArrayList<String> nr = new ArrayList<String>();
			for(String val: rr)
			{
				nr.add(val);
				nr.add(ch+val);
			}
			return nr;
		}
	}
	
	
	public static void ss2(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			char ch = ques.charAt(0);
			ss2(ques.substring(1),ans+ch);
			ss2(ques.substring(1),ans);
		}
	}
	public static int ss3(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
			return 1;
		}
		else
		{
			char ch = ques.charAt(0);
			int count = 0;
			count += ss3(ques.substring(1),ans+ch);
			count += ss3(ques.substring(1),ans);
			
			return count;
		}
	}
	public static int Asciiss(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
			return 1;
		}
		else
		{
			char ch = ques.charAt(0);
			int count = 0;
			count += Asciiss(ques.substring(1),ans+ch);
			count += Asciiss(ques.substring(1),ans);
			count += Asciiss(ques.substring(1),ans+(int)ch);
			return count;
		}
	}
	

}
