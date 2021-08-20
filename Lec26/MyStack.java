package Lec26;

public class MyStack {

	protected int[] arr;
	protected int top;
	
	public MyStack(int size)
	{
		arr  = new int[size];
		top = -1;
	}
	public MyStack()
	{
		this(10);
	}
	
	//O(1)
	public boolean isFull()
	{
		if(top == arr.length-1)
			return true;
		else
			return false;
	}
	
	//O(1)
	public void push(int ele) throws Exception
	{
		if(isFull())
		{
			throw new Exception("Stack Overflow");
		}
		
		top++;
		arr[top] = ele;
	}
	
	//O(1)
	public boolean isEmpty()
	{
		if(top == -1)
			return true;
		else
			return false;
	}
	
	//O(1)
	public int peek() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Stack Underflow");
		}
		return arr[top];
	}
	
	//O(1)
	public int pop() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Stack Underflow");
		}
		
		int ele = arr[top];
		top--;
		return ele;
	}
	
	//O(1)
	public int size()
	{
		return top+1;
	}
	
	//O(n)
	public void display()
	{
		for(int i = top; i >= 0; i--)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
}
