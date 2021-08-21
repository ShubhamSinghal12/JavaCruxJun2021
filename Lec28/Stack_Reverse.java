package Lec28;

import Lec27.DynamicStack;

public class Stack_Reverse {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		DynamicStack st = new DynamicStack();
		
		for(int i = 1; i <= 5; i++)
			st.push(i);
		
		st.display();
		
//		displayReverse2(st);
//		System.out.println();
		
		ar3(st);
		
		st.display();

	}
	
	public static void displayReverse(DynamicStack st) throws Exception
	{
		DynamicStack temp = new DynamicStack();
		
		while(!st.isEmpty())
		{
			temp.push(st.pop());
		}
		
//		temp.display();
		
		while(!temp.isEmpty())
		{
			int n = temp.pop();
			System.out.print(n+" ");
			st.push(n);
		}
	}
	
	public static void displayReverse2(DynamicStack st) throws Exception
	{
		if(st.isEmpty())
		{
			return;
		}
		
		int n = st.pop();
		displayReverse2(st);
		System.out.print(n+" ");
		st.push(n);
	}
	
	
	public static void actualReverse(DynamicStack st) throws Exception{
		DynamicStack temp1 = new DynamicStack();
		DynamicStack temp2 = new DynamicStack();
		
		while(!st.isEmpty())
		{
			temp1.push(st.pop());
		}
		
		while(!temp1.isEmpty())
		{
			temp2.push(temp1.pop());
		}
		
		while(!temp2.isEmpty())
		{
			st.push(temp2.pop());
		}
	}
	
	public static void aR2(DynamicStack st) throws Exception
	{
		DynamicStack temp = new DynamicStack();
		while(!st.isEmpty())
		{
			temp.push(st.pop());
		}
		
		ar2Helper(st,temp);
	}
	
	public static void ar2Helper(DynamicStack st, DynamicStack temp) throws Exception
	{
		if(temp.isEmpty())
		{
			return;
		}
		int n = temp.pop();
		ar2Helper(st, temp);
		st.push(n);
	}
	
	
	public static void ar3(DynamicStack st) throws Exception
	{
		if(st.isEmpty())
		{
			return;
		}
		int n = st.pop();
		ar3(st);
		pushAtFirst(st,n);
	}
	
	public static void pushAtFirst(DynamicStack st, int n) throws Exception
	{
		if(st.isEmpty())
		{
			st.push(n);
			return;
		}
		
		int i = st.pop();
		pushAtFirst(st, n);
		st.push(i);
		
	}

}
