package Lec19;

import java.util.ArrayList;

public class DifferentWaysToAddParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(dif("2*3-4+5"));

	}
	
	public static int operation(int a,int b,char op)
	{
		if(op == '+')
			return a+b;
		else if(op == '-')
			return a-b;
		else
			return a*b;
	}
	public static ArrayList<Integer> dif(String exp)
	{
		if(exp.indexOf('+') == -1 && exp.indexOf('-') == -1 && exp.indexOf('*') == -1)
		{
			ArrayList<Integer> al = new ArrayList<Integer>();
			al.add(Integer.parseInt(exp));
			return al;
		}
		else
		{
			ArrayList<Integer> ans = new ArrayList<Integer>();
			for(int i = 0; i < exp.length(); i++)
			{
				if(exp.charAt(i) == '+' || exp.charAt(i) == '-' || exp.charAt(i) == '*')
				{
					ArrayList<Integer> left = dif(exp.substring(0,i));
					ArrayList<Integer> right = dif(exp.substring(i+1));
					
					for(int lval:left)
					{
						for(int rval:right)
						{
							ans.add(operation(lval,rval,exp.charAt(i)));
						}
					}
				}
				
			}
			return ans;
		}
		
	}

}
